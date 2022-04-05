package com.boot.bansis.savings.fixed.account.services.impl;

import com.boot.bansis.savings.fixed.account.dto.SavingsAccountDto;
import com.boot.bansis.savings.fixed.account.entities.SavingsAccount;
import com.boot.bansis.savings.fixed.account.repositories.SavingsAccountRepository;
import com.boot.bansis.savings.fixed.account.services.SavingsAccountService;
import com.boot.bansis.savings.fixed.account.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
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
    public Mono<SavingsAccountDto> save(Mono<SavingsAccountDto> savingsAccountDtoMono) {
        return savingsAccountDtoMono.map(Utils::dtoToEntity)
                .filter(p -> !p.getHolder().getId()
                        .equals("1"))   
                .flatMap(savingsAccountDao::insert)
                .map(Utils::entityToDto);
    }

    @Override
    public Mono<SavingsAccount> update(Mono<SavingsAccount> savingsAccount, String id) {
        return savingsAccountDao.findById(id)
                .flatMap(p -> savingsAccount
                        .doOnNext(e -> e.setId(id))
                        .doOnNext(e -> e.setCreatedAt(p.getCreatedAt())))
                .flatMap(savingsAccountDao::save);
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return savingsAccountDao.deleteById(id);
    }
}
