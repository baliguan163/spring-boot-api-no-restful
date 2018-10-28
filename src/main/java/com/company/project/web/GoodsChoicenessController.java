package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.GoodsChoiceness;
import com.company.project.service.GoodsChoicenessService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by ado on 2018-10-26.
*/
@RestController
@RequestMapping("/goods/choiceness")
public class GoodsChoicenessController {
    @Resource
    private GoodsChoicenessService goodsChoicenessService;

    @PostMapping("/add")
    public Result add(GoodsChoiceness goodsChoiceness) {
        goodsChoicenessService.save(goodsChoiceness);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam(value = "id", required = true) Integer id) {
        GoodsChoiceness goodsChoiceness = goodsChoicenessService.findById(id);
        if(goodsChoiceness != null)
        {
            goodsChoicenessService.deleteById(id);
            return ResultGenerator.genSuccessResult();
        }
        else
        {
             return ResultGenerator.genFailResult("数据不存在，删除数据失败");
        }
    }

    @PostMapping("/update")
    public Result update(GoodsChoiceness goodsChoiceness) {
        goodsChoicenessService.update(goodsChoiceness);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam(value = "id", required = true) Integer id) {
        GoodsChoiceness goodsChoiceness = goodsChoicenessService.findById(id);
        if(goodsChoiceness != null)
        {
            return ResultGenerator.genSuccessResult(goodsChoiceness);
        }
        else
        {
            return ResultGenerator.genFailResult("数据不存在，获取详情失败");
        }
    }



    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<GoodsChoiceness> list = goodsChoicenessService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }






}
