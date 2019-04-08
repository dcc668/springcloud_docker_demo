package com.sermatec.energy_meter.service.fallback;

import com.sermatec.common.consts.Consts;
import com.sermatec.energy_meter.service.RedisService;

import java.util.logging.Logger;


/**
 * @author : DongChenchen
 * @date : 2019/4/8  11:12
 */
public class RedisServiceFallback implements RedisService {
    private Logger log = Logger.getLogger("RedisServiceFallback");
    @Override
    public String set(String key, String value) {
        return Consts.RESULT_FAIL;
    }

    @Override
    public String set_with_time(String key, String value, int seconds) {
        return Consts.RESULT_FAIL;
    }

    @Override
    public String get(String key) {
        return null;
    }
}
