package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.GoodsGroupbuying;
import com.company.project.service.GoodsGroupbuyingService;
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
@RequestMapping("/goods/groupbuying")
public class GoodsGroupbuyingController {
    @Resource
    private GoodsGroupbuyingService goodsGroupbuyingService;

    @PostMapping("/add")
    public Result add(GoodsGroupbuying goodsGroupbuying) {
        goodsGroupbuyingService.save(goodsGroupbuying);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam(value = "id", required = true) Integer id) {
        GoodsGroupbuying goodsGroupbuying = goodsGroupbuyingService.findById(id);
        if(goodsGroupbuying != null)
        {
            goodsGroupbuyingService.deleteById(id);
            return ResultGenerator.genSuccessResult();
        }
        else
        {
             return ResultGenerator.genFailResult("数据不存在，删除数据失败");
        }
    }

    @PostMapping("/update")
    public Result update(GoodsGroupbuying goodsGroupbuying) {
        goodsGroupbuyingService.update(goodsGroupbuying);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam(value = "id", required = true) Integer id) {
        GoodsGroupbuying goodsGroupbuying = goodsGroupbuyingService.findById(id);
        if(goodsGroupbuying != null)
        {
            return ResultGenerator.genSuccessResult(goodsGroupbuying);
        }
        else
        {
            return ResultGenerator.genFailResult("数据不存在，获取详情失败");
        }
    }



    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<GoodsGroupbuying> list = goodsGroupbuyingService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }






}
