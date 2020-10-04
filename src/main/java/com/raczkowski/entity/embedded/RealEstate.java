package com.raczkowski.entity.embedded;

import javax.persistence.*;

@Entity
public class RealEstate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String propertyName;

    @Embedded
    private Address propertyAddress;

    /**
     * Nested annotations are separated by commas
     */
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "AGENCY_STREET_NUMBER")),
            @AttributeOverride(name = "houseNumber", column = @Column(name = "AGENCY_HOUSE_NUMBER"))
    })
    private Address propertyAgencyAddress;

    public RealEstate() {
    }

    public RealEstate(String propertyName, Address address, Address propertyAgencyAddress) {
        this.propertyName = propertyName;
        this.propertyAddress = address;
        this.propertyAgencyAddress = propertyAgencyAddress;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public Address getPropertyAddress() {
        return propertyAddress;
    }

    public Address getPropertyAgencyAddress() {
        return propertyAgencyAddress;
    }
}
