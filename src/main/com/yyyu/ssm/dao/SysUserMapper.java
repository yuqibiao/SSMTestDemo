package com.yyyu.ssm.dao;

import com.yyyu.ssm.pojo.LoginVo;
import com.yyyu.ssm.pojo.SysUser;

public interface SysUserMapper {

    /**
     * 用户登录验证
     *
     * @param loginVo
     * @return
     */
     SysUser getSysUserByLoginVo(LoginVo loginVo);

}