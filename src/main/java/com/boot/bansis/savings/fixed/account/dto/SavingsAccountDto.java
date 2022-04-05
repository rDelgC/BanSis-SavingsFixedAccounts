package com.boot.bansis.savings.fixed.account.dto;

import com.boot.bansis.savings.fixed.account.entities.AccountType;
import com.boot.bansis.savings.fixed.account.entities.Holder;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author rDelgC
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SavingsAccountDto {

    private String id;
    private String accountNumber;
    private AccountType accountType;
    private String interbankAccountCode;
    private double availableBalance;
    private String currency;
    private Holder holder;
    private char status;
    private Date createdAt;
    private Date updatedAt;

}
