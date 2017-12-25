package com.wbkit.entity;

/**
 * Created by Administrator on 2017/10/16.
 */
public class UserBean {
    private int userId;
    private String loginName;
    private String loginPwd;
    private String name;
    private String roleId;
    private String isActive;

    public UserBean() {
    }

    public UserBean(String loginName, String loginPwd) {
        this.loginName = loginName;
        this.loginPwd = loginPwd;
    }

    public UserBean(int userId, String loginName, String loginPwd, String name, String roleId, String isActive) {
        this.userId = userId;
        this.loginName = loginName;
        this.loginPwd = loginPwd;
        this.name = name;
        this.roleId = roleId;
        this.isActive = isActive;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }
}
