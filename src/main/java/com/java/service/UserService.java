package com.java.service;

import com.java.entity.User;

import java.util.List;

/**
 * @author nidegui
 * @create 2019-06-05 9:31
 */
public interface UserService { /**
 * 添加用户
 * @param user
 */
    public void add(User user);

    /**
     * 通过id删除
     * @param id
     * @return
     */
    public Integer delete(Integer id);
    /**
     * 查询所有的用户
     * @return
     */
    public List<User> selectAll();

}