package com.raczkowski.repository;

import com.raczkowski.entity.onetoone.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Long> {
}
