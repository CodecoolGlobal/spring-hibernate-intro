package com.raczkowski.repository;

import com.raczkowski.entity.onetomany.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
