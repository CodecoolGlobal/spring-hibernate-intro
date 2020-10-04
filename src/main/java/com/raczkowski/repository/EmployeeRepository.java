package com.raczkowski.repository;

import com.raczkowski.entity.onetoone.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
