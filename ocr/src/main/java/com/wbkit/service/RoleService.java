package com.wbkit.service;

import com.wbkit.entity.PageBean;
import com.wbkit.entity.RoleBean;

import java.util.List;

public interface RoleService {

    public List<RoleBean> allRoleInfo(PageBean pageBean);

    public int getRoleCount();
}
