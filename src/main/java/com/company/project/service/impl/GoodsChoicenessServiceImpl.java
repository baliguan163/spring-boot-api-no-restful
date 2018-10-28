package com.company.project.service.impl;

import com.company.project.dao.GoodsChoicenessMapper;
import com.company.project.model.GoodsChoiceness;
import com.company.project.service.GoodsChoicenessService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ado on 2018-10-26.
 */
@Service
@Transactional
public class GoodsChoicenessServiceImpl extends AbstractService<GoodsChoiceness> implements GoodsChoicenessService {
    @Resource
    private GoodsChoicenessMapper goodsChoicenessMapper;

}
