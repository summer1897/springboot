package com.springboot.test.service;

import com.springboot.test.model.User;

import java.util.List;

/**
 * Created by Intellij IDEA
 *
 * @Author summer
 * @Date 2017/12/7 上午12:12
 * @Description
 */
public interface IUserService {

    User queryByName(String name);

    List<User> queryAll();
}
