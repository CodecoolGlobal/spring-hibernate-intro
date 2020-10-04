package com.raczkowski.repository;

import com.raczkowski.entity.embedded.RealEstate;
import org.springframework.data.repository.CrudRepository;

public interface RealEstateRepository extends CrudRepository<RealEstate, Long> {
}
