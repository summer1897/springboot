package com.springboot.test;

import com.springboot.test.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Intellij IDEA
 *
 * @Author summer
 * @Date 2017/12/6 下午11:07
 * @Description spring boot install test
 */
@RestController
@EnableAutoConfiguration
public class App {

    @RequestMapping("/userInfo")
    @ResponseBody
    public User getUserInfo() {
        User user = new User(1,"summer",30,"summer@sina.com");
        return user;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }

}
