package com.wbkit.dao;

import com.wbkit.entity.UserBean;
import org.springframework.stereotype.Repository;

import javax.xml.registry.infomodel.User;
import java.util.List;

/**
 * Created by Administrator on 2017/10/16.
 */
@Repository
public interface UserMapper {
    public UserBean login(UserBean userBean);
    public int updateUser(UserBean user);

    public UserBean getUserById(int id);

    public int updatePassword(String userId, String newPwd);

    public List<UserBean> getAllUsersInfo(int startPage, int endPage);

    public int getUserCount();
}
