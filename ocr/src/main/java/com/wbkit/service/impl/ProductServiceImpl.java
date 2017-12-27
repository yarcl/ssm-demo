package com.wbkit.service.impl;

import com.wbkit.dao.ProductMapper;
import com.wbkit.entity.PageBean;
import com.wbkit.entity.ProductBean;
import com.wbkit.service.ProductService;
import com.wbkit.util.CaculatePage;

import java.util.List;

/**
 * Created by Administrator on 2017/9/18.
 */
public class ProductServiceImpl implements ProductService {

    private ProductMapper productMapper;

    public ProductMapper getProductMapper() {
        return productMapper;
    }

    public void setProductMapper(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    public int getProductCount() {
        return productMapper.getProductCount();
    }

    public List<ProductBean> getRazorProductByUserId(String userId, PageBean pageBean) {
        return productMapper.getRazorProductByUserId(userId, CaculatePage.caculateStart(pageBean), CaculatePage.caculateEnd(pageBean));
    }
}
