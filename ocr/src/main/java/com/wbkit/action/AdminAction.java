package com.wbkit.action;

import com.wbkit.entity.PageBean;
import com.wbkit.entity.UserBean;
import com.wbkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminAction {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    private PageBean pageBean = new PageBean();

    @RequestMapping("/allAdminUsers.do")
    public ModelAndView allUsersInfo(ModelAndView mav, String nowPage){
        if(nowPage!=null && !"".equals(nowPage)){
            pageBean.setNowPage(Integer.parseInt(nowPage));
        }
        List<UserBean> userList = userService.getAllUsersInfo(pageBean);
        pageBean.setCount(userService.getUserCount());
        mav.addObject("page", pageBean);
        mav.addObject("userList", userList);
        mav.setViewName("/page/admin/adminUsersInfo");
        return mav;
    }

}
