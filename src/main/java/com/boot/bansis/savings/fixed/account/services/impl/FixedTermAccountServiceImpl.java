package com.boot.bansis.savings.fixed.account.services.impl;

import com.boot.bansis.savings.fixed.account.entities.FixedTermAccount;
import com.boot.bansis.savings.fixed.account.repositories.FixedTermAccountRepository;
import com.boot.bansis.savings.fixed.account.services.FixedTermAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author rDelgC
 */
@Service
public class FixedTermAccountServiceImpl implements FixedTermAccountService {

    @Autowired
    private FixedTermAccountRepository fixedTermAccountDao;

    @Override
    public Flux<FixedTermAccount> findAll() {
        return fixedTermAccountDao.findAll();
    }

    @Override
    public Mono<FixedTermAccount> findById(String id) {
        return fixedTermAccountDao.findById(id);
    }

    @Override
    public Mono<FixedTermAccount> save(FixedTermAccount fixedTermAccount) {
        return fixedTermAccountDao.save(fixedTermAccount);
    }

    @Override
    public Mono<FixedTermAccount> update(FixedTermAccount fixedTermAccount, String id) {
        return null;
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return fixedTermAccountDao.deleteById(id);
    }

}
