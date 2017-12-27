package com.wbkit.service;



import com.wbkit.entity.MenuBean;
import com.wbkit.entity.PageBean;

import java.util.List;

public interface MenuService {
    public List<MenuBean> allMenuInfo(PageBean pageBean);

    public int getMenuCount();
}
