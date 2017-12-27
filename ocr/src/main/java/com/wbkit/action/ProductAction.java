package com.wbkit.action;

import com.wbkit.entity.PageBean;
import com.wbkit.entity.ProductBean;
import com.wbkit.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Administrator on 2017/9/19.
 */
@Controller
@RequestMapping("/")
public class ProductAction {
    @Autowired
    @Qualifier("productService")
    private ProductService productService;

    private PageBean pageBean = new PageBean();;

    @RequestMapping("/myProductInfo.do")
    public ModelAndView allProductInfo(ModelAndView mav, String userId, String nowPage){
        if(nowPage!=null && !"".equals(nowPage)){
            pageBean.setNowPage(Integer.parseInt(nowPage));
        }
        List<ProductBean> razorProductList = productService.getRazorProductByUserId(userId, pageBean);
        pageBean.setCount(productService.getProductCount());
        mav.addObject("razorProductList", razorProductList);
        mav.addObject("page", pageBean);
        mav.setViewName("page/product/productList");
        return mav;
    }
}
