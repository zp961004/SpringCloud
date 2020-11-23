package com.zp.dao;

import com.zp.bean.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: springcloud-demo
 * @description: UserRepository 接口实现类
 * @author: Mr.ZP
 * @create: 2020-11-17 19:38
 **/
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private Map<Long, Student> studentMap;

    public StudentRepositoryImpl(){
        studentMap = new HashMap<>();
        studentMap.put(1L,new Student(1L,"张三",'男'));
        studentMap.put(2L,new Student(2L,"李四",'男'));
        studentMap.put(3L,new Student(3L,"王五",'男'));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(Long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student user) {
        studentMap.put(user.getId(),user);
    }

    @Override
    public void deleteById(Long id) {
        studentMap.remove(id);
    }
}
