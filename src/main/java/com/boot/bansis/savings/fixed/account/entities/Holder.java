package com.boot.bansis.savings.fixed.account.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author rDelgC
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Holder {

    @Field("client_id")
    private String id;

    @Field("first_name")
    private String firstName;

    @Field("last_name")
    private String lastName;

    @Field("vip")
    private boolean vip;
}
