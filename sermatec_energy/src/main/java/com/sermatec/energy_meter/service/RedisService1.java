package com.sermatec.energy_meter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author : DongChenchen
 * @date : 2019/4/4  10:21
 */
@Service
public class RedisService1 {
    @Autowired
    RedisTemplate redisTemplate;  //k-v都是对象的
    @Autowired
    StringRedisTemplate stringRedisTemplate;  //k-v都是对象的
    public void save(){
        stringRedisTemplate.opsForValue().append("cc","hello");
        String msg = stringRedisTemplate.opsForValue().get("cc");
        System.out.println(msg);
    }
    public Object get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    public void set(String key, Object value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public void set(String key, Object value, int seconds) {
        redisTemplate.opsForValue().set(key, value, seconds, TimeUnit.SECONDS);
    }
}
