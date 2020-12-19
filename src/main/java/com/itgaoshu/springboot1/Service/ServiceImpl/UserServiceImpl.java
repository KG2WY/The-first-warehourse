package com.itgaoshu.springboot1.Service.ServiceImpl;

import com.itgaoshu.springboot1.Service.UserService;
import com.itgaoshu.springboot1.UserMapper.UserMapper;
import com.itgaoshu.springboot1.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Cacheable("selectAll")//将查询出来的数据放到redis缓存中
    public List<User> selectAll1(){
        System.out.println("访问了数据库");
        return userMapper.selectAll();
    }
}
