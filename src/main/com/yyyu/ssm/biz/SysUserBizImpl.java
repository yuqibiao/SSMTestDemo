package com.yyyu.ssm.biz;

import com.yyyu.ssm.dao.SysUserMapper;
import com.yyyu.ssm.pojo.LoginVo;
import com.yyyu.ssm.pojo.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能：用户表相关的业务操作接口实现
 *
 * @author yu
 * @date 2017/7/17.
 */
@Service("sysUserBiz")
public class SysUserBizImpl implements SysUserBiz {

    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public SysUser checkLogin(LoginVo loginVo) {

        return sysUserMapper.getSysUserByLoginVo(loginVo);
    }
}
