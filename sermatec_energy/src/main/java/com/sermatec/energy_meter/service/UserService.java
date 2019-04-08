package com.sermatec.energy_meter.service;

import com.sermatec.energy_meter.dao.UserMapper;
import com.sermatec.energy_meter.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    public UserMapper userMapper;
    public User findUserById(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }
    public Integer update(User user){
        return userMapper.updateByPrimaryKey(user);
    }
    public Integer delete(User user){
        return userMapper.delete(user);
    }
    public Integer add(User user){
        Integer us = userMapper.insert(user);
        return us;
    }

}
