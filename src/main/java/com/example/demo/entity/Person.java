package com.example.demo.entity;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by linyi on 2018/7/25.
 */

@Component
public class Person {
    public String name;
    public String password;

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
}
