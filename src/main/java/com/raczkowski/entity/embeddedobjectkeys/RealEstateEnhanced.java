package com.raczkowski.entity.embeddedobjectkeys;

import com.raczkowski.entity.embedded.Address;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "REAL_ESTATE_ENHANCED")
public class RealEstateEnhanced {

    @EmbeddedId
    private PropertyName propertyName;

    @Embedded
    private Address propertyAddress;

    public RealEstateEnhanced() {
    }

    public RealEstateEnhanced(PropertyName propertyName, Address address) {
        this.propertyName = propertyName;
        this.propertyAddress = address;
    }

    public PropertyName getPropertyName() {
        return propertyName;
    }

    public Address getPropertyAddress() {
        return propertyAddress;
    }

}
