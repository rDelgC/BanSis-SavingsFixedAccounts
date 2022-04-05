package com.boot.bansis.savings.fixed.account.services;

import com.boot.bansis.savings.fixed.account.entities.FixedTermAccount;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author rDelgC
 */
@Service
public interface FixedTermAccountService {

    public Flux<FixedTermAccount> findAll();

    public Mono<FixedTermAccount> findById(String id);

    public Mono<FixedTermAccount> save(Mono<FixedTermAccount> fixedTermAccount);

    public Mono<FixedTermAccount> update(Mono<FixedTermAccount> fixedTermAccount, String id);

    public Mono<Void> deleteById(String id);

}
