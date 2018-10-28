package com.company.project.service.impl;

import com.company.project.dao.GoodsGroupbuyingMapper;
import com.company.project.model.GoodsGroupbuying;
import com.company.project.service.GoodsGroupbuyingService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ado on 2018-10-26.
 */
@Service
@Transactional
public class GoodsGroupbuyingServiceImpl extends AbstractService<GoodsGroupbuying> implements GoodsGroupbuyingService {
    @Resource
    private GoodsGroupbuyingMapper goodsGroupbuyingMapper;

}
