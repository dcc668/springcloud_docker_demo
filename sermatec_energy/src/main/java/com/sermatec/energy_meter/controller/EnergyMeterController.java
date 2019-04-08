package com.sermatec.energy_meter.controller;

import com.alibaba.fastjson.JSONObject;
import com.sermatec.energy_meter.service.EnergyMeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class EnergyMeterController {
    @Autowired
    EnergyMeterService energyMeterService;

    @RequestMapping(name = "/getEnergy",method = RequestMethod.GET)
    public String getEnergy(HttpServletRequest request){
//        Integer id=Integer.parseInt(request.getParameter("id"));
        try{
            return JSONObject.toJSONString(energyMeterService.findOneById(1L));
        }catch (Exception e){e.printStackTrace();}
        return null;
    }
}
