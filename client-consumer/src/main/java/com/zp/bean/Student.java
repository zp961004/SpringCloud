package com.zp.bean;

/**
 * @program: springcloud-demo
 * @description: 实体类
 * @author: Mr.ZP
 * @create: 2020-11-17 20:57
 **/

public class Student {
    private long id;
    private String name;
    private char gender;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
