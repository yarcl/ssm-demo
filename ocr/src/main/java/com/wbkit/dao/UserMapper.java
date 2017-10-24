package com.wbkit.dao;

import com.wbkit.entity.UserBean;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/10/16.
 */
@Repository
public interface UserMapper {
    public UserBean login(UserBean userBean);
}
