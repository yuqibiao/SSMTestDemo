package com.yyyu.ssm.test;

import com.yyyu.ssm.biz.BaseDictBiz;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/7/19.
 */
public class BaseDictBizTest extends BaseTest{

    @Autowired
    private BaseDictBiz baseDictBiz;

    @Test
    public void testBaseDictBiz(){
        baseDictBiz.getBaseDictByTypeCode("001");
    }

}
