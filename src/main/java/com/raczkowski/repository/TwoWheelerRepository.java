package com.raczkowski.repository;

import com.raczkowski.entity.inheritance.TwoWheeler;
import org.springframework.data.repository.CrudRepository;

public interface TwoWheelerRepository extends CrudRepository<TwoWheeler, Long> {
}
