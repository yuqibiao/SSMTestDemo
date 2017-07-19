package com.yyyu.ssm.biz;

import com.yyyu.ssm.pojo.BaseDict;

import java.util.List;

/**
 * 功能：数据字典
 *
 * @author yu
 * @date 2017/7/18.
 */
public interface BaseDictBiz {

    List<BaseDict> getBaseDictByTypeCode(String typeCode);

}
