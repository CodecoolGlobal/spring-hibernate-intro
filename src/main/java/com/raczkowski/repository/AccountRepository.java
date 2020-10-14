package com.raczkowski.repository;

import com.raczkowski.entity.transactions.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {

    Account findAccountByUserId(Long id);
}
