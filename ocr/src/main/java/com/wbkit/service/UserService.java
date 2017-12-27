package com.wbkit.service;

import com.wbkit.entity.PageBean;
import com.wbkit.entity.UserBean;

import java.util.List;

/**
 * Created by Administrator on 2017/10/16.
 */
public interface UserService {
    public UserBean login(UserBean user);

    public int updateUser(UserBean user);

    public UserBean getUserById(int id);

    public int updatePassword(String userId, String newPwd);

    public List<UserBean> getAllUsersInfo(PageBean pageBean);

    public int getUserCount();
}
