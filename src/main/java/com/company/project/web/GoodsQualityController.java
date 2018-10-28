package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.GoodsQuality;
import com.company.project.service.GoodsQualityService;
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
@RequestMapping("/goods/quality")
public class GoodsQualityController {
    @Resource
    private GoodsQualityService goodsQualityService;

    @PostMapping("/add")
    public Result add(GoodsQuality goodsQuality) {
        goodsQualityService.save(goodsQuality);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam(value = "id", required = true) Integer id) {
        GoodsQuality goodsQuality = goodsQualityService.findById(id);
        if(goodsQuality != null)
        {
            goodsQualityService.deleteById(id);
            return ResultGenerator.genSuccessResult();
        }
        else
        {
             return ResultGenerator.genFailResult("数据不存在，删除数据失败");
        }
    }

    @PostMapping("/update")
    public Result update(GoodsQuality goodsQuality) {
        goodsQualityService.update(goodsQuality);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam(value = "id", required = true) Integer id) {
        GoodsQuality goodsQuality = goodsQualityService.findById(id);
        if(goodsQuality != null)
        {
            return ResultGenerator.genSuccessResult(goodsQuality);
        }
        else
        {
            return ResultGenerator.genFailResult("数据不存在，获取详情失败");
        }
    }



    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<GoodsQuality> list = goodsQualityService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }






}
