package com.wbkit.service;

import com.wbkit.entity.PageBean;
import com.wbkit.entity.ProductBean;

import java.util.List;

/**
 * Created by Administrator on 2017/9/18.
 */
public interface ProductService {

    public List<ProductBean> getRazorProductByUserId(String userId, PageBean pageBean);

    public int getProductCount();
}
