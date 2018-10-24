package com.company.project.service.impl;

import com.company.project.dao.ChoicenessGoodsListMapper;
import com.company.project.model.ChoicenessGoodsList;
import com.company.project.service.ChoicenessGoodsListService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ado on 2018-10-24.
 */
@Service
@Transactional
public class ChoicenessGoodsListServiceImpl extends AbstractService<ChoicenessGoodsList> implements ChoicenessGoodsListService {
    @Resource
    private ChoicenessGoodsListMapper choicenessGoodsListMapper;

}
