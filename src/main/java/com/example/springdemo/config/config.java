package com.example.springdemo.config;

import com.example.springdemo.Bean.Account;
import com.example.springdemo.Bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @Author: fnbory
 * @Date: 6/11/2019 下午 9:46
 */

@Configuration
public class config {

    @Bean
    public User user(){
        return new User(100,"bbf");
    }

    @Bean
    public BfProcessor bfProcessor(){
        return new BfProcessor();
    }

    @Bean
    public MyBeanPostProcessor beanPostProcessor(){
        MyBeanPostProcessor myBeanPostProcessor=new MyBeanPostProcessor();
        return myBeanPostProcessor;
    }
    @Bean(initMethod = "init",destroyMethod = "close")
    public Account account(){
        return new Account("fff");
    }

}
