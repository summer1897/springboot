package com.springboot.test.service.impl;

import com.springboot.test.model.User;
import com.springboot.test.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.test.service.IUserService;

import java.util.List;

/**
 * Created by Intellij IDEA
 *
 * @Author summer
 * @Date 2017/12/7 上午12:13
 * @Description
 */
@Service(value = "userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryByName(String name) {
        return userMapper.queryByName(name);
    }

    @Override
    public List<User> queryAll() {
        return userMapper.queryAll();
    }
}
