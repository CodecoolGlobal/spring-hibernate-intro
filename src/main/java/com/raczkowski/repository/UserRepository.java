package com.raczkowski.repository;

import com.raczkowski.entity.collections.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
