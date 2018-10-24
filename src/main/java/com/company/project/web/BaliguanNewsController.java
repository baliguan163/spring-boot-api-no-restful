package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.BaliguanNews;
import com.company.project.service.BaliguanNewsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by ado on 2018-02-02.
*/
@RestController
@RequestMapping("/baliguan/news")
public class BaliguanNewsController {
    @Resource
    private BaliguanNewsService baliguanNewsService;

    @PostMapping("/add")
    public Result add(BaliguanNews baliguanNews) {
        baliguanNewsService.save(baliguanNews);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam(value = "id", required = true) Integer id) {
        BaliguanNews baliguanNews = baliguanNewsService.findById(id);
        if(baliguanNews != null)
        {
            baliguanNewsService.deleteById(id);
            return ResultGenerator.genSuccessResult();
        }
        else
        {
             return ResultGenerator.genFailResult("数据不存在，删除数据失败");
        }
    }

    @PostMapping("/update")
    public Result update(BaliguanNews baliguanNews) {
        baliguanNewsService.update(baliguanNews);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam(value = "id", required = true) Integer id) {
        BaliguanNews baliguanNews = baliguanNewsService.findById(id);
        if(baliguanNews != null)
        {
            return ResultGenerator.genSuccessResult(baliguanNews);
        }
        else
        {
            return ResultGenerator.genFailResult("数据不存在，获取详情失败");
        }
    }



    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<BaliguanNews> list = baliguanNewsService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }






}
