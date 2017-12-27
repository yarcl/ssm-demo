package com.wbkit.action;

import com.wbkit.entity.PageBean;
import com.wbkit.entity.RoleBean;
import com.wbkit.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleAction {

    @Autowired
    @Qualifier("roleService")
    private RoleService roleService;

    private PageBean pageBean = new PageBean();

    @RequestMapping("/allRoleInfo.do")
    public ModelAndView allRoleInfo(ModelAndView mav, String nowPage){
        if(nowPage!=null && !"".equals(nowPage)){
            pageBean.setNowPage(Integer.parseInt(nowPage));
        }
        List<RoleBean> roleList = roleService.allRoleInfo(pageBean);
        pageBean.setCount(roleService.getRoleCount());
        mav.addObject("page", pageBean);
        mav.addObject("roleList", roleList);
        mav.setViewName("/page/role/allRoleInfo");
        return mav;
    }
}
