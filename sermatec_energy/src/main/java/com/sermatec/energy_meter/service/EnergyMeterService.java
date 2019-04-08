package com.sermatec.energy_meter.service;

import com.sermatec.energy_meter.dao.EnergyMapper;
import com.sermatec.energy_meter.entity.EnergyMeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnergyMeterService {
    @Autowired
    public EnergyMapper energyMapper;
    public EnergyMeter findOneById(Long id){
        return energyMapper.selectByPrimaryKey(id);
    }
    public Integer update(EnergyMeter energyMeter){
        return energyMapper.updateByPrimaryKey(energyMeter);
    }
    public Integer delete(EnergyMeter energyMeter){
        return energyMapper.delete(energyMeter);
    }
    public Integer insertOne(EnergyMeter energyMeter){
        Integer us = energyMapper.insert(energyMeter);
        return us;
    }

}
