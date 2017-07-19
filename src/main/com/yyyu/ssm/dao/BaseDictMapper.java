package com.yyyu.ssm.dao;

import com.yyyu.ssm.pojo.BaseDict;

import java.util.List;

public interface BaseDictMapper {

    BaseDict selectByPrimaryKey(String dictId);

    List<BaseDict> getBaseDictByTypeCode(String typeCode);

}