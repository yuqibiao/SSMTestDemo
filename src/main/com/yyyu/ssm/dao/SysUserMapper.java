package com.yyyu.ssm.dao;

import com.yyyu.ssm.pojo.LoginVo;
import com.yyyu.ssm.pojo.SysUser;

public interface SysUserMapper {

    /**
     * 根据id得到用户信息
     *
     * @param userId
     * @return
     */
    SysUser getSysUserByUserId(long userId);

    /**
     * 用户登录验证
     *
     * @param loginVo
     * @return
     */
     SysUser getSysUserByLoginVo(LoginVo loginVo);

}