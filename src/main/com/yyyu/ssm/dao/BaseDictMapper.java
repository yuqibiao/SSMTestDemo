package com.yyyu.ssm.dao;

import com.yyyu.ssm.pojo.BaseDict;

public interface BaseDictMapper {

    BaseDict selectByPrimaryKey(String dictId);

    BaseDict getBaseDictByTypeCode(String typeCode);

}