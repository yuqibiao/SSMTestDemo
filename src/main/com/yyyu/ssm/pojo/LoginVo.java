package com.yyyu.ssm.pojo;

/**
 * 功能：登录验证数据封装（根据用户名密码、查数据）
 *
 * @author yu
 * @date 2017/7/17.
 */
public class LoginVo {

    private String userName;
    private String userPassword;

    public LoginVo() {

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
