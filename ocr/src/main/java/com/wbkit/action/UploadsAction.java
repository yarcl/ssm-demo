package com.wbkit.action;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Administrator on 2017/10/17.
 */
@Controller
@RequestMapping("/upload")
public class UploadsAction {



    @RequestMapping("/uploadImgs.do")
    public ModelAndView uploadFiles(@RequestParam(value = "files", required = true) List<MultipartFile> files, ModelAndView mav){

        System.out.println("hello upload files");

        return mav;
    }


}
