package com.raczkowski.entity.inheritance;

import javax.persistence.Entity;

@Entity
public class TwoWheeler extends Vehicle {

    private int frameSize;

    public TwoWheeler() {
    }

    public TwoWheeler(String name, int frameSize) {
        super(name);
        this.frameSize = frameSize;
    }


    public void setFrameSize(int frameSize) {
        this.frameSize = frameSize;
    }
}
