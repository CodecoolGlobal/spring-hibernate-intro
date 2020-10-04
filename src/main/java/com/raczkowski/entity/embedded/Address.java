package com.raczkowski.entity.embedded;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String street;
    private int houseNumber;

    public Address() {
    }

    public Address(String field, int houseNumber) {
        this.street = field;
        this.houseNumber = houseNumber;
    }

    public void setStreet(String field) {
        this.street = field;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
