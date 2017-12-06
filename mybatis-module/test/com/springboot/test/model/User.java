package com.springboot.test.model;

import java.io.Serializable;

/**
 * Created by Intellij IDEA
 *
 * @Author summer
 * @Date 2017/12/7 上午12:03
 * @Description
 */
public class User implements Serializable {
    private Integer id;
    private String name;
    private String password;
    private String passwordSalt;

    public User() {}

    public User(Integer id, String name, String password, String passwordSalt) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.passwordSalt = passwordSalt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }
}
