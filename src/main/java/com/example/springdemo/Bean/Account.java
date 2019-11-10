package com.example.springdemo.Bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @Author: fnbory
 * @Date: 8/11/2019 下午 2:19
 */

public class Account {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Account(String name){
        this.name=name;
    }


    public void init() throws Exception {
        this.setName("bbfff");
    }


    public void close() throws Exception {
        System.out.println("exit...##############################################");
    }
}
