package com.raczkowski.entity.transactions;

import com.raczkowski.entity.collections.User;
import com.raczkowski.repository.AccountRepository;
import com.raczkowski.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.transaction.annotation.Isolation.SERIALIZABLE;

@Service
public class AccountManagementService {
    private UserRepository userRepository;
    private AccountRepository accountRepository;

    public AccountManagementService(UserRepository userRepository,
                                    AccountRepository accountRepository) {
        this.userRepository = userRepository;
        this.accountRepository = accountRepository;
    }

    @Transactional(isolation = SERIALIZABLE)
    public void registerNewBankUserWithAccount(User user) {
        userRepository.save(user);
        Account ing = new Account(new Bank("ING"), user);
        accountRepository.save(ing);
    }

    @Transactional
    public void removeUserWithAccount(Long id) {
        userRepository.deleteById(id);
        Account account = accountRepository.findAccountByUserId(id);
        accountRepository.deleteById(account.getId());
    }
}
