package com.wbkit.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/system")
@Controller
public class SystemAction {

    @RequestMapping("/systemInfo.do")
    public ModelAndView catchSystemInfo(ModelAndView mav){



        return mav;
    }

}
