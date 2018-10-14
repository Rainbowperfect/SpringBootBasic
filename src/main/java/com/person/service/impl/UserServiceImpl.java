package com.person.service.impl;

import com.person.dao.UserDao;
import com.person.pojo.User;
import com.person.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author steven
 * @version 1.0
 * @description com.itheima.service.impl
 * @date 2018-3-16
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User getUser() {
        return userDao.getUser();
    }
}
