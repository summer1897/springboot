package com.springboot.test.controller;

import com.springboot.test.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.test.service.IUserService;

import java.util.List;

/**
 * Created by Intellij IDEA
 *
 * @Author summer
 * @Date 2017/12/7 上午12:14
 * @Description
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/list/{name}")
    @ResponseBody
    public User queryByName(@PathVariable("name") String name) {
        return userService.queryByName(name);
    }

    @RequestMapping("/list")
    public List<User> queryAll() {
        return userService.queryAll();
    }
}
