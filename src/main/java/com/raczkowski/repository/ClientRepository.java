package com.raczkowski.repository;

import com.raczkowski.entity.cascadetypes.all.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {
}
