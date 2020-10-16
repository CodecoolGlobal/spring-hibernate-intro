package com.raczkowski.repository;

import com.raczkowski.entity.cascadetypes.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
