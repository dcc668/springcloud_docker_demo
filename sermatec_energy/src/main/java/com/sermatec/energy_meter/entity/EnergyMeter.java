package com.sermatec.energy_meter.entity;


import javax.persistence.*;
import java.io.Serializable;

/**
 * 储能电表
 */
@Entity(name = "t_energy_meter")
public class EnergyMeter implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    @Column
    private String voltage;//电压235.3/236.3/236 V
    @Column
    private String current;//电流114.4/114.4/114.4 A
    @Column
    private String active_power ;//总有功功率80.5 kW
    @Column
    private String power_factor;//功率因数0.972
    @Column
    private String forward_energy;//正向有功电能118680 kWh
    @Column
    private String back_energy;//反向有功电能


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public String getActive_power() {
        return active_power;
    }

    public void setActive_power(String active_power) {
        this.active_power = active_power;
    }

    public String getPower_factor() {
        return power_factor;
    }

    public void setPower_factor(String power_factor) {
        this.power_factor = power_factor;
    }

    public String getForward_energy() {
        return forward_energy;
    }

    public void setForward_energy(String forward_energy) {
        this.forward_energy = forward_energy;
    }

    public String getBack_energy() {
        return back_energy;
    }

    public void setBack_energy(String back_energy) {
        this.back_energy = back_energy;
    }
}
