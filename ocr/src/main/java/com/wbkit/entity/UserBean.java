package com.wbkit.entity;

/**
 * Created by Administrator on 2017/10/16.
 */
public class UserBean {
    private int id;
    private String loginName;
    private String loginPwd;

    public UserBean() {
    }

    public UserBean(int id, String loginName, String loginPwd) {
        this.id = id;
        this.loginName = loginName;
        this.loginPwd = loginPwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }
}
