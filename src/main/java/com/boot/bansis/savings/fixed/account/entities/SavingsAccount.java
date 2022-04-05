package com.boot.bansis.savings.fixed.account.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author rDelgC
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("savings_accounts")
public class SavingsAccount extends Account {

    @Field("account_type")
    private AccountType accountType;

    @Field("interbank_account_code")
    private String interbankAccountCode;

    @Field("available_balance")
    private double availableBalance;

}
