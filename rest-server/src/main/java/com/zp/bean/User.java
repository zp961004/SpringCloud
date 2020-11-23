package com.zp.bean;

/**
 * @program: springcloud-demo
 * @description: User 实体类
 * @author: Mr.ZP
 * @create: 2020-11-17 19:37
 **/
public class User {
    private Long id;
    private String name;
    private Integer age;

    public User(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
