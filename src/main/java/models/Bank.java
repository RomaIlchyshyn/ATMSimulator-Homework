package models;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
public class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
        initializeTestAccounts();
    }

    private void initializeTestAccounts() {
        accounts.add(new Account("4512", 1234, BigDecimal.valueOf(400.0)));
        accounts.add(new Account("1111", 1111, BigDecimal.valueOf(666.0)));
        accounts.add(new Account("9999", 7777, BigDecimal.valueOf(1345.345)));
    }

    public Optional<Account> findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return Optional.of(account);
            }
        }
        return Optional.empty();
    }
}

