package com.raczkowski.repository;

import com.raczkowski.entity.cascadetypes.all.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
