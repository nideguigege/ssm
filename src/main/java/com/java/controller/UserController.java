package com.java.controller;

import com.java.entity.User;
import com.java.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author nidegui
 * @create 2019-06-05 9:52
 */
@Controller
@RequestMapping("/hotel_war")
public class UserController {

    @Resource
    private  UserService userService;

    /**
     * 添加用户
     * @param user
     * @return
     * @throws Exception
     */
    @RequestMapping("/add.do")
    public String add(User user) throws  Exception{
        userService.add(user);
        return "ok";
    }

    /**
     * 根据id删除
     * @param id
     * @return
     * @throws Exception
     */
    @RequestMapping("/delete.do}")
    public String deleete(Integer id) throws  Exception{
        userService.delete(id);
        return "okdelete";
    }

    /**
     * 查看所有的用户信息
     * @return
     * @throws Exception
     */
    @RequestMapping
    public Map<String,Object> select() throws  Exception{
        Map<String,Object> resultMap=new HashMap<>();
        List<User> users = userService.selectAll();
        resultMap.put("users",users);
        return  resultMap;
    }
}
