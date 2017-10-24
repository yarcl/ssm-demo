package com.wbkit.service;

import com.wbkit.entity.UserBean;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/10/16.
 */
public interface UserService {
    public UserBean login(UserBean user);
}
