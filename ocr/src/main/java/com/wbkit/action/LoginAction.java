package com.wbkit.action;

import com.wbkit.entity.UserBean;
import com.wbkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/12/25.
 */
@Controller
@RequestMapping("/login")
@SessionAttributes("user")
public class LoginAction {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping(value="/login.do", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public ModelAndView login(String loginName, String loginPwd, ModelAndView mav){

        UserBean user = userService.login(new UserBean(loginName, loginPwd));

        if(user!=null&&"1".equals(user.getIsActive())){
            user.setLoginPwd("");
            mav.addObject("user", user);
            mav.setViewName("/index");
        } else if(user!=null&&"0".equals(user.getIsActive())){
            mav.setViewName("/login");
            mav.addObject("state", "0");
        } else {
            mav.setViewName("/login");
            mav.addObject("state", "error");
        }
        return mav;
    }

    @RequestMapping(value="/login.do", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public ModelAndView loginBack(HttpServletRequest request, ModelAndView mav){
        HttpSession session = request.getSession();
        if(session!=null){
            mav.setViewName("/index");
        } else {
            mav.setViewName("/login");
        }
        return mav;
    }

    @RequestMapping(value="/loginOut.do", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public ModelAndView loginOut(ModelAndView mav, HttpServletRequest request){
        HttpSession session = request.getSession();
        if(session!=null){
            session.removeAttribute("user");
        }
        mav.setViewName("/login");
        return mav;
    }
}
