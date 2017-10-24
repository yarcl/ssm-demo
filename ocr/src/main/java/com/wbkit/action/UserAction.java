package com.wbkit.action;

import com.wbkit.entity.UserBean;
import com.wbkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/10/16.
 */
@Controller
@RequestMapping("/user")
public class UserAction {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping("/login.do")
    public ModelAndView login(ModelAndView mav){
        UserBean userBean = userService.login(new UserBean(0 , "admin", "admin"));
        System.out.println(userBean.getId());
        System.out.println("hello");
        return mav;
    }

}
