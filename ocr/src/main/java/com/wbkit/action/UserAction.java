package com.wbkit.action;

import com.wbkit.entity.UserBean;
import com.wbkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value="/login.do", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public ModelAndView login(ModelAndView mav,String userName, String userPwd){
        UserBean userBean = userService.login(new UserBean(0 , userName, userPwd));
        System.out.println(userBean.getId());
        System.out.println("hello");
        return mav;
    }

}
