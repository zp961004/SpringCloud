package com.zp.dao;

import com.zp.bean.Student;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @program: springcloud-demo
 * @description: 容错处理逻辑
 * @author: Mr.ZP
 * @create: 2020-11-19 22:24
 **/
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public String index() {
        return "服务器维护中....";
    }

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(long id) {
        return null;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void deleteById(long id) {

    }
}
