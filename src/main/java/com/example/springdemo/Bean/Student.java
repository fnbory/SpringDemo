package com.example.springdemo.Bean;

/**
 * @Author: fnbory
 * @Date: 7/11/2019 下午 2:36
 */
public class Student {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }
}
