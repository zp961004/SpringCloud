package com.zp.dao;

import com.zp.bean.Student;

import java.util.Collection;

public interface StudentRepository {
        public Collection<Student> findAll();
        public Student findById(Long id);
        public void saveOrUpdate(Student user);
        public void deleteById(Long id);
}
