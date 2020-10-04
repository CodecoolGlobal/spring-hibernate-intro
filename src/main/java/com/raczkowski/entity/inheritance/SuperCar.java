package com.raczkowski.entity.inheritance;

import javax.persistence.Entity;

@Entity
public class SuperCar extends Vehicle {

    private int maxSpeed;

    public SuperCar() {
    }

    public SuperCar(String name, int maxSpeed) {
        super(name);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
