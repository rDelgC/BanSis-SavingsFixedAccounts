package com.boot.bansis.savings.fixed.account.entities;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author rDelgC
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    private String id;

    @Field("account_number")
    private String accountNumber;

    @Field("currency")
    private String currency;

    @Field("holder")
    private Holder holder;

    @Field("status")
    private char status;

    @Field("created_at")
    @CreatedDate
    private Date createdAt;

    @Field("updated_at")
    @LastModifiedDate
    private Date UpdatedAt;

}
