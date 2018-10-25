package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.ChoicenessGoodsList;
import com.company.project.service.ChoicenessGoodsListService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by ado on 2018-10-24.
*/
@RestController
@RequestMapping("/choiceness/goods/list")
public class ChoicenessGoodsListController {
    @Resource
    private ChoicenessGoodsListService choicenessGoodsListService;

    @PostMapping("/add")
    public Result add(ChoicenessGoodsList choicenessGoodsList) {
        choicenessGoodsListService.save(choicenessGoodsList);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam(value = "id", required = true) Integer id) {
        ChoicenessGoodsList choicenessGoodsList = choicenessGoodsListService.findById(id);
        if(choicenessGoodsList != null)
        {
            choicenessGoodsListService.deleteById(id);
            return ResultGenerator.genSuccessResult();
        }
        else
        {
             return ResultGenerator.genFailResult("数据不存在，删除数据失败");
        }
    }
    @PostMapping("/update")
    public Result update(ChoicenessGoodsList choicenessGoodsList) {
        choicenessGoodsListService.update(choicenessGoodsList);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam(value = "id", required = true) Integer id) {
        ChoicenessGoodsList choicenessGoodsList = choicenessGoodsListService.findById(id);
        if(choicenessGoodsList != null)
        {
            return ResultGenerator.genSuccessResult(choicenessGoodsList);
        }
        else
        {
            return ResultGenerator.genFailResult("数据不存在，获取详情失败");
        }
    }



    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page,
                       @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<ChoicenessGoodsList> list = choicenessGoodsListService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }






}
