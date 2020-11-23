package com.zp.controller;

import com.zp.bean.User;
import com.zp.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @program: springcloud-demo
 * @description: 实现 CRUD 相关业务方法
 * @author: Mr.ZP
 * @create: 2020-11-17 19:39
 **/
@RestController
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findAll")
    public Collection<User> findAll(){
        return userRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") Long id){
        return userRepository.findById(id);
    }

    @PostMapping("/save")
    public Collection<User> save(@RequestBody User user){
        userRepository.saveOrUpdate(user);
        return userRepository.findAll();
    }

    @PutMapping("/update")
    public void update(@RequestBody User user){
        userRepository.saveOrUpdate(user);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Long id){
        userRepository.deleteById(id);
    }
}