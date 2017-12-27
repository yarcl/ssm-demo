package com.wbkit.service.impl;

import com.wbkit.dao.RoleMapper;
import com.wbkit.entity.PageBean;
import com.wbkit.entity.RoleBean;
import com.wbkit.service.RoleService;
import com.wbkit.util.CaculatePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class RoleServiceImpl implements RoleService {

    @Autowired
    @Qualifier("roleMapper")
    private RoleMapper roleMapper;

    public void setRoleMapper(RoleMapper roleMapper) {
        this.roleMapper = roleMapper;
    }

    public List<RoleBean> allRoleInfo(PageBean pageBean) {
        return roleMapper.allRoleInfo(CaculatePage.caculateStart(pageBean), CaculatePage.caculateEnd(pageBean));
    }

    public int getRoleCount() {
        return roleMapper.getRoleCount();
    }
}
