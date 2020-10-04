package com.raczkowski.repository;

import com.raczkowski.entity.inheritance.SuperCar;
import org.springframework.data.repository.CrudRepository;

public interface SuperCarRepository extends CrudRepository<SuperCar, Long> {
}
