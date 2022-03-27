package com.boot.bansis.savings.fixed.account.services.impl;

import com.boot.bansis.savings.fixed.account.entities.SavingsAccount;
import com.boot.bansis.savings.fixed.account.repositories.SavingsAccountRepository;
import com.boot.bansis.savings.fixed.account.services.SavingsAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author rDelgC
 */
@Service
public class SavingsAccountServiceImpl implements SavingsAccountService {

    @Autowired
    private SavingsAccountRepository savingsAccountDao;

    @Override
    public Flux<SavingsAccount> findAll() {
        return savingsAccountDao.findAll();
    }

    @Override
    public Mono<SavingsAccount> findById(String id) {
        return savingsAccountDao.findById(id);
    }

    @Override
    public Mono<SavingsAccount> save(SavingsAccount savingsAccount) {
        return savingsAccountDao.save(savingsAccount);
    }

    @Override
    public Mono<SavingsAccount> update(SavingsAccount savingsAccount, String id) {
        //return savingsAccountDao.save
        return null;
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return savingsAccountDao.deleteById(id);
    }
}
