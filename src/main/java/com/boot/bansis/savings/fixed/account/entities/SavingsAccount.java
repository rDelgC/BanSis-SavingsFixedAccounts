package com.boot.bansis.savings.fixed.account.entities;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
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
public class SavingsAccount {

    @Field("account_type")
    private AccountType accountType;

    @Field("interbank_account_code")
    private String interbankAccountCode;

    @Field("available_balance")
    private double availableBalance;
}
