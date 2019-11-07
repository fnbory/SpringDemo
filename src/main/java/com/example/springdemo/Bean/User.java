package com.example.springdemo.Bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: fnbory
 * @Date: 6/11/2019 下午 9:24
 */

public class User implements FactoryBean {

    private int id;

    private String name;

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public Object getObject() throws Exception {
        return new User(1,"fbb");
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
