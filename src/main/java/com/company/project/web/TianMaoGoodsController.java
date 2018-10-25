package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.TianMaoGoods;
import com.company.project.service.TianMaoGoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by ado on 2018-01-23.
*/
@RestController
@RequestMapping("/tian/mao/goods")
public class TianMaoGoodsController {
    @Resource
    private TianMaoGoodsService tianMaoGoodsService;

    @PostMapping("/add")
    public Result add(TianMaoGoods tianMaoGoods) {
        tianMaoGoodsService.save(tianMaoGoods);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam(value = "id", required = true) Integer id) {
        TianMaoGoods tianMaoGoods = tianMaoGoodsService.findById(id);
        if(tianMaoGoods != null)
        {
            tianMaoGoodsService.deleteById(id);
            return ResultGenerator.genSuccessResult();
        }
        else
        {
             return ResultGenerator.genFailResult("数据不存在，删除数据失败");
        }
    }

    @PostMapping("/update")
    public Result update(TianMaoGoods tianMaoGoods) {
        tianMaoGoodsService.update(tianMaoGoods);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam(value = "id", required = true) Integer id) {
        TianMaoGoods tianMaoGoods = tianMaoGoodsService.findById(id);
        if(tianMaoGoods != null)
        {
            return ResultGenerator.genSuccessResult(tianMaoGoods);
        }
        else
        {
            return ResultGenerator.genFailResult("数据不存在，获取详情失败");
        }
    }

    @PostMapping("/goods_id")
    public Result goods_id(@RequestParam(value = "goods_id", required = true) String goods_id) {
        TianMaoGoods tianMaoGoods = tianMaoGoodsService.findBy("goodsId",goods_id);
        if(tianMaoGoods != null)
        {
            return ResultGenerator.genSuccessResult(tianMaoGoods);
        }
        else
        {
           return ResultGenerator.genFailResult("数据不存在，获取详情失败");
        }
    }

    //ceshi
    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TianMaoGoods> list = tianMaoGoodsService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
