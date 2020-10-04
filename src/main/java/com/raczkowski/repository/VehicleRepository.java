package com.raczkowski.repository;

import com.raczkowski.entity.inheritance.Vehicle;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRepository extends CrudRepository<Vehicle, Long> {
}
