package com.boot.bansis.savings.fixed.account.entities;

import java.util.Date;
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
@Document("fixed_term_accounts")
public class FixedTermAccount extends Account {

    @Field("balance")
    private double balance;

    @Field("txn_day")
    private int txnDay;

    @Field("terminate_at")
    private Date terminateAt;
}
