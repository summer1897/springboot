package com.springboot.test.mapper;

import com.springboot.test.model.User;

import java.util.List;

/**
 * Created by Intellij IDEA
 *
 * @Author summer
 * @Date 2017/12/6 下午11:59
 * @Description user mapper
 */
public interface UserMapper {

    /**
     * query by usernmae
     * @param name
     * @return @{User}
     */
    User queryByName(String name);

    /**
     * query all user
     * @return @{List<User}
     */
    List<User> queryAll();

}
