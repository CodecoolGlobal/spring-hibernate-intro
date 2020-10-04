package com.raczkowski.entity.embeddedobjectkeys;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PropertyName implements Serializable {

    private String name;
    private String owner;

    public PropertyName() {
    }

    public PropertyName(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
