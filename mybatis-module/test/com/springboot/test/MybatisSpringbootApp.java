package com.springboot.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Intellij IDEA
 *
 * @Author summer
 * @Date 2017/12/7 上午12:20
 * @Description
 */
@SpringBootApplication
@MapperScan("com.springboot.test.mapper")
public class MybatisSpringbootApp {
    public static void main(String[] args) {
        SpringApplication.run(MybatisSpringbootApp.class,args);
    }
}
