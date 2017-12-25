package com.wbkit.action;

import com.wbkit.entity.UserBean;
import com.wbkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/12/25.
 */
@Controller
@RequestMapping("/ocr-web/")
public class LoginAction {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping("login.do")
    public ModelAndView login(String loginName, String loginPwd, ModelAndView mav){

        UserBean user = userService.login(new UserBean(loginName, loginPwd));

        if(user!=null){
            user.setLoginPwd("");
            mav.addObject("user", user);

            mav.setViewName("index");
        } else {
            mav.setViewName("login");
        }
        return mav;
    }
}
