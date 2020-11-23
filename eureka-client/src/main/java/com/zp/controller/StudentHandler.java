package com.zp.controller;

import com.zp.bean.Student;
import com.zp.dao.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @program: springcloud-demo
 * @description: 实现 CRUD 相关业务方法
 * @author: Mr.ZP
 * @create: 2020-11-17 19:39
 **/
@RestController
@RequestMapping("/student")
public class StudentHandler {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id){
        return studentRepository.findById(id);
    }

    @PostMapping("/save")
    public Collection<Student> save(@RequestBody Student Student){
        studentRepository.saveOrUpdate(Student);
        return studentRepository.findAll();
    }

    @PutMapping("/update")
    public void update(@RequestBody Student Student){
        studentRepository.saveOrUpdate(Student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Long id){
        studentRepository.deleteById(id);
    }

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index(){
        return "当前端口："+this.port;
    }

}