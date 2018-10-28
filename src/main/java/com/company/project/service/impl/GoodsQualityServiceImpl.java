package com.company.project.service.impl;

import com.company.project.dao.GoodsQualityMapper;
import com.company.project.model.GoodsQuality;
import com.company.project.service.GoodsQualityService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ado on 2018-10-26.
 */
@Service
@Transactional
public class GoodsQualityServiceImpl extends AbstractService<GoodsQuality> implements GoodsQualityService {
    @Resource
    private GoodsQualityMapper goodsQualityMapper;

}
