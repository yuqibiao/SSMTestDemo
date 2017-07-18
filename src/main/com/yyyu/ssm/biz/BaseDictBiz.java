package com.yyyu.ssm.biz;

import com.yyyu.ssm.pojo.BaseDict;

/**
 * 功能：数据字典
 *
 * @author yu
 * @date 2017/7/18.
 */
public interface BaseDictBiz {

    BaseDict getBaseDictByTypeCode(String typeCode);

}
