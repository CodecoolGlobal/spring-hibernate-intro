package com.raczkowski.repository;

import com.raczkowski.entity.cascadetypes.Brand;
import org.springframework.data.repository.CrudRepository;

public interface BrandRepository extends CrudRepository<Brand, Long> {
}
