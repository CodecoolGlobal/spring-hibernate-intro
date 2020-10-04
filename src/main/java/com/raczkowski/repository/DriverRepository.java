package com.raczkowski.repository;

import com.raczkowski.entity.manytomany.Driver;
import org.springframework.data.repository.CrudRepository;

public interface DriverRepository extends CrudRepository<Driver, Long> {
}
