package com.yyyu.ssm.controller;

import com.yyyu.ssm.biz.SysUserBiz;
import com.yyyu.ssm.pojo.LoginVo;
import com.yyyu.ssm.pojo.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * 功能：登录控制器
 *
 * @author yu
 * @date 2017/7/17.
 */

@Controller
public class LoginController {

    @Autowired
    private SysUserBiz sysUserBiz;

    /**
     * 验证用户登录
     *
     * @param userName
     * @param userPassword
     * @return
     */
    @RequestMapping(value = {"user/checkUser.action" } , method = RequestMethod.POST)
    public String checkUser(String userName , String userPassword  , HttpSession session){
        System.out.println("userName=="+userName);
        String result ;
        LoginVo loginVo = new LoginVo();
        loginVo.setUserName(userName);
        loginVo.setUserPassword(userPassword);
        SysUser user = sysUserBiz.checkLogin(loginVo);
        if(user !=null){
            result =  "userInfo";
            session.setAttribute("userInfo" , user);
        }else{
            result =  "login";
        }

        return result;
    }

}
