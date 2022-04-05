package com.boot.bansis.savings.fixed.account.controllers;

import com.boot.bansis.savings.fixed.account.dto.SavingsAccountDto;
import com.boot.bansis.savings.fixed.account.entities.FixedTermAccount;
import com.boot.bansis.savings.fixed.account.entities.SavingsAccount;
import com.boot.bansis.savings.fixed.account.services.FixedTermAccountService;
import com.boot.bansis.savings.fixed.account.services.SavingsAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author rDelgC
 */
@RestController
@RequestMapping("/accounts")
public class AccountRestController {

    @Autowired
    private SavingsAccountService savingsAccountService;

    @Autowired
    private FixedTermAccountService fixedTermAccountService;

    //Savings accounts endpoints
    @GetMapping("/savings")
    public Flux<SavingsAccount> getAllSavings() {
        return savingsAccountService.findAll();
    }

    @GetMapping("/savings/{id}")
    public Mono<SavingsAccount> getSavings(@PathVariable String id) {
        return savingsAccountService.findById(id);
    }

    @PostMapping("/savings/save")
    public Mono<SavingsAccountDto> saveSavings(@RequestBody Mono<SavingsAccountDto> savingsAccountDtoMono) {
        return savingsAccountService.save(savingsAccountDtoMono);
    }

    @PutMapping("/savings/update/{id}")
    public Mono<SavingsAccount> updateSavings(@RequestBody Mono<SavingsAccount> savingsAccountMono, @PathVariable String id) {
        return savingsAccountService.update(savingsAccountMono, id);
    }

    @DeleteMapping("/savings/delete/{id}")
    public Mono<Void> deleteSavings(@PathVariable String id) {
        return savingsAccountService.deleteById(id);
    }

    //Fixed term accounts endpoints
    @GetMapping("/fixed-term")
    public Flux<FixedTermAccount> getAllFixedTerm() {
        return fixedTermAccountService.findAll();
    }

    @GetMapping("/fixed-term/{id}")
    public Mono<FixedTermAccount> getFixedTerm(@PathVariable String id) {
        return fixedTermAccountService.findById(id);
    }

    @PostMapping("/fixed-term/save")
    public Mono<FixedTermAccount> saveFixedTerm(@RequestBody Mono<FixedTermAccount> fixedTermAccountMono) {
        return fixedTermAccountService.save(fixedTermAccountMono);
    }

    @PutMapping("/fixed-term/update/{id}")
    public Mono<FixedTermAccount> updateFixedTerm(@RequestBody Mono<FixedTermAccount> fixedTermAccountMono, @PathVariable String id) {
        return fixedTermAccountService.update(fixedTermAccountMono, id);
    }

    @DeleteMapping("/fixed-term/delete/{id}")
    public Mono<Void> deleteFixedTerm(@PathVariable String id) {
        return fixedTermAccountService.deleteById(id);
    }

}
