package com.wbkit.service.impl;

import com.wbkit.dao.MenuMapper;
import com.wbkit.entity.MenuBean;
import com.wbkit.entity.PageBean;
import com.wbkit.service.MenuService;
import com.wbkit.util.CaculatePage;

import java.util.List;

public class MenuServiceImpl implements MenuService {

    private MenuMapper menuMapper;

    public MenuMapper getMenuMapper() {
        return menuMapper;
    }

    public void setMenuMapper(MenuMapper menuMapper) {
        this.menuMapper = menuMapper;
    }

    public List<MenuBean> allMenuInfo(PageBean pageBean) {
        return menuMapper.allMenuInfo(CaculatePage.caculateStart(pageBean), CaculatePage.caculateEnd(pageBean));
    }

    public int getMenuCount() {
        return menuMapper.getMenuCount();
    }
}
