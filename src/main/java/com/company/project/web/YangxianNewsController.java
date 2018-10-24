package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.YangxianNews;
import com.company.project.service.YangxianNewsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by ado on 2018-02-02.
*/
@RestController
@RequestMapping("/yangxian/news")
public class YangxianNewsController {
    @Resource
    private YangxianNewsService yangxianNewsService;

    @PostMapping("/add")
    public Result add(YangxianNews yangxianNews) {
        yangxianNewsService.save(yangxianNews);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam(value = "id", required = true) Integer id) {
        YangxianNews yangxianNews = yangxianNewsService.findById(id);
        if(yangxianNews != null)
        {
            yangxianNewsService.deleteById(id);
            return ResultGenerator.genSuccessResult();
        }
        else
        {
             return ResultGenerator.genFailResult("数据不存在，删除数据失败");
        }
    }

    @PostMapping("/update")
    public Result update(YangxianNews yangxianNews) {
        yangxianNewsService.update(yangxianNews);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam(value = "id", required = true) Integer id) {
        YangxianNews yangxianNews = yangxianNewsService.findById(id);
        if(yangxianNews != null)
        {
            return ResultGenerator.genSuccessResult(yangxianNews);
        }
        else
        {
            return ResultGenerator.genFailResult("数据不存在，获取详情失败");
        }
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        //设置降序
        Condition condition = new Condition(YangxianNews.class);
        condition.orderBy("newDate").desc();
        List<YangxianNews> list = yangxianNewsService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
