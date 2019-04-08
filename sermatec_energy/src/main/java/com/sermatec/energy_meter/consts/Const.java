package com.sermatec.energy_meter.consts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;
/**
 * @author : DongChenchen
 * @date : 2019/4/3  15:48
 */
@Configuration
public class Const {
	@Autowired
    Environment environment;

	public static String REDIS_IP;
	public static String REDIS_PORT;
	public static String REDIS_PASSWORD;

	@PostConstruct
	public void doStart() {
		Const.REDIS_IP = environment.getProperty("spring.redis.host");
		Const.REDIS_PORT = environment.getProperty("spring.redis.port");
		Const.REDIS_PASSWORD = environment.getProperty("spring.redis.password");
	}

}
