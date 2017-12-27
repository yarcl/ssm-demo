package com.wbkit.dao;

import com.wbkit.entity.RoleBean;

import java.util.List;

public interface RoleMapper {
    public List<RoleBean> allRoleInfo(int startPage, int endPage);

    public int getRoleCount();
}
