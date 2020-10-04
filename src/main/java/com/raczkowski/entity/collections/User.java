package com.raczkowski.entity.collections;

import com.raczkowski.entity.embedded.Address;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.FetchType.EAGER;

@Entity(name = "USER_DETAILS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "NAME")
    private String firstName;
    private String lastName;

    @GenericGenerator(name = "increment", strategy = "increment")
    @CollectionId(columns = {
            @Column(name = "ADDRESS_ID")},
            type = @Type(type = "long"),
            generator = "increment")
    @ElementCollection(fetch = EAGER)
    @JoinTable(name = "USER_ADDRESS", joinColumns = {
            @JoinColumn(name = "USER_ID")
    })
    private List<Address> addresses;

    protected User() {
    }

    public User(String firstName, String lastName, List<Address> addresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addresses = addresses;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}
