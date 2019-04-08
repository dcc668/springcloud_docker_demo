package com.sermatec.redis_base.controller;

import com.alibaba.fastjson.JSONObject;
import com.sermatec.common.consts.Consts;
import com.sermatec.common.utils.Result;
import com.sermatec.redis_base.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author : DongChenchen
 * @date : 2019/4/8  10:06
 */
@RestController
public class RedisController {
    @Autowired
    RedisService redisService;

    @RequestMapping(value = "get",method = RequestMethod.GET)
    public String get(String key) {
        Result res=new Result();
        try {
            String data = redisService.get(key);
            res.setCode(Consts.RESULT_OK);
            res.setData(data);
        }catch (Exception e){
            res.setCode(Consts.RESULT_FAIL);
            res.setMsg(e.getMessage());
        }
        return JSONObject.toJSONString(res);
    }

    @RequestMapping(value = "set",method = RequestMethod.POST)
    public String set(String key, String value) {
        Result res=new Result();
        try {
            redisService.set(key, value);
            res.setCode(Consts.RESULT_OK);
        }catch (Exception e){
            res.setCode(Consts.RESULT_FAIL);
            res.setMsg(e.getMessage());
        }
        return JSONObject.toJSONString(res);
    }

    @RequestMapping(value = "set_with_time",method = RequestMethod.POST)
    public String set_with_time(String key, String value, int seconds) {
        Result res=new Result();
        try {
            redisService.set_with_time(key, value, seconds);
            res.setCode(Consts.RESULT_OK);
        }catch (Exception e){
            res.setCode(Consts.RESULT_FAIL);
            res.setMsg("存储{"+key+":"+value+"}时发送异常,异常信息:"+e.getMessage());
        }
        return JSONObject.toJSONString(res);

    }

}
