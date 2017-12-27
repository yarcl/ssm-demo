package com.wbkit.dao;

import com.wbkit.entity.MenuBean;

import java.util.List;

public interface MenuMapper {


    public List<MenuBean> allMenuInfo(int startPage, int endPage);

    public int getMenuCount();
}
