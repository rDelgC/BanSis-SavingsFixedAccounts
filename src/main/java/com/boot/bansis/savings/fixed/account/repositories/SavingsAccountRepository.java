package com.boot.bansis.savings.fixed.account.repositories;

import com.boot.bansis.savings.fixed.account.entities.SavingsAccount;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rDelgC
 */
@Repository
public interface SavingsAccountRepository extends ReactiveMongoRepository<SavingsAccount, String> {

}
