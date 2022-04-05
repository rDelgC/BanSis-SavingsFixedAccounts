package com.boot.bansis.savings.fixed.account.utils;

import com.boot.bansis.savings.fixed.account.dto.FixedTermAccountDto;
import com.boot.bansis.savings.fixed.account.dto.SavingsAccountDto;
import com.boot.bansis.savings.fixed.account.entities.FixedTermAccount;
import com.boot.bansis.savings.fixed.account.entities.SavingsAccount;
import org.springframework.beans.BeanUtils;

/**
 *
 * @author rDelgC
 */
public class Utils {

    // SavingsAccount utils
    public static SavingsAccountDto entityToDto(SavingsAccount savingsAccount) {
        SavingsAccountDto savingsAccountDto = new SavingsAccountDto();
        BeanUtils.copyProperties(savingsAccount, savingsAccountDto);
        return savingsAccountDto;
    }

    public static SavingsAccount dtoToEntity(SavingsAccountDto savingsAccountDto) {
        SavingsAccount savingsAccount = new SavingsAccount();
        BeanUtils.copyProperties(savingsAccountDto, savingsAccount);
        return savingsAccount;
    }

    // FixedTermAccount utils
    public static FixedTermAccountDto entityToDto(FixedTermAccount fixedTermAccount) {
        FixedTermAccountDto fixedTermAccountDto = new FixedTermAccountDto();
        BeanUtils.copyProperties(fixedTermAccount, fixedTermAccountDto);
        return fixedTermAccountDto;
    }

    public static FixedTermAccount dtoToEntity(FixedTermAccountDto fixedTermAccountDto) {
        FixedTermAccount fixedTermAccount = new FixedTermAccount();
        BeanUtils.copyProperties(fixedTermAccountDto, fixedTermAccount);
        return fixedTermAccount;
    }
}
