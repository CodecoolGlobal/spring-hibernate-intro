package com.raczkowski.entity.onetomany;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;


    //    @OneToMany(mappedBy = "customer")
//    @OneToMany(cascade = CascadeType.ALL)
    @OneToMany
    @JoinTable(inverseJoinColumns = @JoinColumn(name = "ORDER_ID"))
    private List<Order> orders;

    protected Customer() {
    }

    public Customer(String firstName,
                    String lastName,
                    List<Order> orders) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.orders = orders;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
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

    public List<Order> getOrders() {
        return orders;
    }
}