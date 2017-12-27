package com.wbkit.service.impl;

import com.wbkit.dao.UserMapper;
import com.wbkit.entity.PageBean;
import com.wbkit.entity.UserBean;
import com.wbkit.service.UserService;
import com.wbkit.util.CaculatePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/10/16.
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserBean login(UserBean userBean) {
        return userMapper.login(userBean);
    }
    public List<UserBean> getAllUsersInfo(PageBean pageBean) {
        return userMapper.getAllUsersInfo(CaculatePage.caculateStart(pageBean), CaculatePage.caculateEnd(pageBean));
    }

    public int updateUser(UserBean user) {
        return userMapper.updateUser(user);
    }

    public UserBean getUserById(int id) {
        return userMapper.getUserById(id);
    }

    public int getUserCount() {
        return userMapper.getUserCount();
    }
    public int updatePassword(String userId, String newPwd) {
        return userMapper.updatePassword(userId, newPwd);
    }
}
