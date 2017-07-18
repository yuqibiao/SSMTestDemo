package com.yyyu.ssm.biz;

import com.yyyu.ssm.dao.BaseDictMapper;
import com.yyyu.ssm.pojo.BaseDict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/7/18.
 */

@Service
public class BaseDictBizImpl implements BaseDictBiz {

    @Autowired
    private BaseDictMapper baseDictMapper;

    @Override
    public BaseDict getBaseDictByTypeCode(String typeCode) {
        return baseDictMapper.getBaseDictByTypeCode(typeCode);
    }
}
