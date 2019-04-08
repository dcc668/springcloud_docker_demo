package com.sermatec.mybatis.entity;

import javax.persistence.*;

@Table(name = "t_energy_meter")
public class TEnergyMeter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "active_power")
    private String activePower;

    @Column(name = "back_energy")
    private String backEnergy;

    private String current;

    @Column(name = "forward_energy")
    private String forwardEnergy;

    @Column(name = "power_factor")
    private String powerFactor;

    private String voltage;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return active_power
     */
    public String getActivePower() {
        return activePower;
    }

    /**
     * @param activePower
     */
    public void setActivePower(String activePower) {
        this.activePower = activePower;
    }

    /**
     * @return back_energy
     */
    public String getBackEnergy() {
        return backEnergy;
    }

    /**
     * @param backEnergy
     */
    public void setBackEnergy(String backEnergy) {
        this.backEnergy = backEnergy;
    }

    /**
     * @return current
     */
    public String getCurrent() {
        return current;
    }

    /**
     * @param current
     */
    public void setCurrent(String current) {
        this.current = current;
    }

    /**
     * @return forward_energy
     */
    public String getForwardEnergy() {
        return forwardEnergy;
    }

    /**
     * @param forwardEnergy
     */
    public void setForwardEnergy(String forwardEnergy) {
        this.forwardEnergy = forwardEnergy;
    }

    /**
     * @return power_factor
     */
    public String getPowerFactor() {
        return powerFactor;
    }

    /**
     * @param powerFactor
     */
    public void setPowerFactor(String powerFactor) {
        this.powerFactor = powerFactor;
    }

    /**
     * @return voltage
     */
    public String getVoltage() {
        return voltage;
    }

    /**
     * @param voltage
     */
    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }
}