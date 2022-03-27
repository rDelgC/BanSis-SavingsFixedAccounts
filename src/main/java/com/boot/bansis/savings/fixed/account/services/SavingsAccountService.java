package com.boot.bansis.savings.fixed.account.services;

import com.boot.bansis.savings.fixed.account.entities.SavingsAccount;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author rDelgC
 */
public interface SavingsAccountService {

    public Flux<SavingsAccount> findAll();

    public Mono<SavingsAccount> findById(String id);

    public Mono<SavingsAccount> save(SavingsAccount savingsAccount);

    public Mono<SavingsAccount> update(SavingsAccount savingsAccount, String id);

    public Mono<Void> deleteById(String id);
}
