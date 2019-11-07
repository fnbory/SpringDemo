package com.example.springdemo.config;

import com.example.springdemo.Bean.Student;
import com.example.springdemo.Bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
}
