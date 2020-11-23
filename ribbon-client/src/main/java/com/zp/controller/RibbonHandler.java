package com.zp.controller;

import com.zp.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @program: springcloud-demo
 * @description: 控制层
 * @author: Mr.ZP
 * @create: 2020-11-19 20:33
 **/
@RequestMapping("/ribbon")
@RestController
public class RibbonHandler {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForObject("http://eurekaprovide/student/findAll",Collection.class);
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return restTemplate.getForObject("http://eurekaprovide/student/findById/{id}",Student.class,id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        restTemplate.postForObject("http://eurekaprovide/student/save",student,Student.class);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.put("http://eurekaprovide/student/update",student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        restTemplate.delete("http://eurekaprovide/student/deleteById/{id}",id);
    }

    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://eurekaprovide/student/index",String.class);
    }
}
