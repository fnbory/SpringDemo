package com.example.springdemo.Bean;

import com.example.springdemo.SpringdemoApplication;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: fnbory
 * @Date: 6/11/2019 下午 9:32
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringdemoApplication.class)
public class UserTest {

    @Autowired
    private  User user;

    @Test
    public void tt(){
        System.out.println(user.getName());
    }
}
