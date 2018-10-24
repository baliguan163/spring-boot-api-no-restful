package com.company.project.service.impl;

import com.company.project.dao.YangxianNewsMapper;
import com.company.project.model.YangxianNews;
import com.company.project.service.YangxianNewsService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ado on 2018-02-02.
 */
@Service
@Transactional
public class YangxianNewsServiceImpl extends AbstractService<YangxianNews> implements YangxianNewsService {
    @Resource
    private YangxianNewsMapper yangxianNewsMapper;

}
