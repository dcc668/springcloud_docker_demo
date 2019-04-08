package com.sermatec.energy_meter;

import com.alibaba.fastjson.JSONObject;
import com.sermatec.energy_meter.entity.User;
import com.sermatec.energy_meter.service.EnergyMeterService;
import com.sermatec.energy_meter.service.UserService;
import com.sermatec.energy_meter.utils.SpringContextHolder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan({"com.sermatec.energy_meter.dao"})
public class EnergyMeterApplication {

    public static void main(String[] args) {
        SpringApplication app=new SpringApplication(EnergyMeterApplication.class);
        ApplicationContext context=app.run(args);
        SpringContextHolder.setApplicationContext(context);
        EnergyMeterService bean = SpringContextHolder.getBean(EnergyMeterService.class);
        UserService bean2 = SpringContextHolder.getBean(UserService.class);
//        EnergyMeter energyMeter=new EnergyMeter();
//            energyMeter.setVoltage("235.3/236.3/236");
//            energyMeter.setCurrent("114.4/114.4/114.4");
//            energyMeter.setActive_power("80.5 kW");
//            energyMeter.setBack_energy("0.972");
//            energyMeter.setPower_factor("118680 kWh");
//            energyMeter.setForward_energy("218680 kWh");
//        bean.insertOne(energyMeter);
//        bean.findOneById(1L);
        User userById = bean2.findUserById(54);
        System.out.println(JSONObject.toJSONString(userById));
//        RedisTestService redisTestService = context.getBean(RedisTestService.class);
//        redisTestService.save();
    }

}
