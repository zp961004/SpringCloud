package com.zp.dao;

import com.zp.bean.User;
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
public class UserRepositoryImpl implements UserRepository {

    private Map<Long, User> userMap;

    public UserRepositoryImpl(){
        userMap = new HashMap<>();
        userMap.put(1L,new User(1L,"张三",21));
        userMap.put(2L,new User(2L,"李四",22));
        userMap.put(3L,new User(3L,"王五",23));
    }

    @Override
    public Collection<User> findAll() {
        return userMap.values();
    }

    @Override
    public User findById(Long id) {
        return userMap.get(id);
    }

    @Override
    public void saveOrUpdate(User user) {
        userMap.put(user.getId(),user);
    }

    @Override
    public void deleteById(Long id) {
        userMap.remove(id);
    }
}
