package com.wbkit.dao;

import com.wbkit.entity.ProductBean;

import java.util.List;

/**
 * Created by Administrator on 2017/9/18.
 */
public interface ProductMapper {

    public List<ProductBean> getRazorProductByUserId(String userId, int startPage, int endPage);


    public int getProductCount();
}
