package com.wbkit.action;

import com.wbkit.entity.MenuBean;
import com.wbkit.entity.PageBean;
import com.wbkit.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/menu")
public class MenuAction {

    @Autowired
    @Qualifier("menuService")
    private MenuService menuService;

    private PageBean pageBean = new PageBean();;

    @RequestMapping("/allMenuInfo.do")
    public ModelAndView allMenuInfo(ModelAndView mav, String nowPage){
        if(nowPage!=null && !"".equals(nowPage)){
            pageBean.setNowPage(Integer.parseInt(nowPage));
            if(pageBean.getNowPage()>pageBean.getTotalPage()){
                pageBean.setNowPage(pageBean.getTotalPage());
                mav.addObject("state", "overRange");
            }
        }
        List<MenuBean> menuList = menuService.allMenuInfo(pageBean);
        pageBean.setCount(menuService.getMenuCount());
        mav.addObject("page", pageBean);
        mav.addObject("menuList", menuList);
        mav.setViewName("/page/menu/allMenuInfo");

        return mav;
    }
}
