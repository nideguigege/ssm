package com.java.service.impl;

import com.java.dao.UserDao;
import com.java.entity.User;
import com.java.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author nidegui
 * @create 2019-06-05 10:18
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    public void add(User user) {

        userDao.add(user);
    }

    @Override
    public Integer delete(Integer id) {
        return  userDao.delete(id);

    }

    @Override
    public List<User> selectAll() {
        return userDao.selectAll();
    }

}
