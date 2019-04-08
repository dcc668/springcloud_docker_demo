package com.sermatec.energy_meter.service;

import com.sermatec.energy_meter.service.fallback.RedisServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author : DongChenchen
 * @date : 2019/4/8  11:09
 */
@FeignClient(value = "redis-base",fallback = RedisServiceFallback.class)
public interface RedisService {

    @RequestMapping(value = "set",method = RequestMethod.POST)
    public String set(@RequestParam(value = "key") String key,
                    @RequestParam(value = "value") String value);
    @RequestMapping(value = "set_with_time", method = RequestMethod.POST)
    public String set_with_time(
            @RequestParam(value = "key") String key,
            @RequestParam(value = "value") String value,
            @RequestParam(value = "seconds") int seconds);

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public String get(@RequestParam(value = "key") String key);
}
