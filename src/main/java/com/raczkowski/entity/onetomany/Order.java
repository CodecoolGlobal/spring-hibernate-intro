package com.raczkowski.entity.onetomany;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "ORDER_DETAILS")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer itemsQuantity;

    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne
    private Customer customer;

    public Order() {
    }

    public Order(Integer itemsQuantity, Date date) {
        this.itemsQuantity = itemsQuantity;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public Integer getItemsQuantity() {
        return itemsQuantity;
    }

    public Date getDate() {
        return date;
    }

    public void setItemsQuantity(Integer itemsQuantity) {
        this.itemsQuantity = itemsQuantity;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
