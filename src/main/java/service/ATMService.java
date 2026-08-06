package service;

import models.Account;
import models.Bank;

import java.math.BigDecimal;

public class ATMService {
    private Account currentAccount;
    private Bank bank;

    public ATMService(Bank bank) {
        this.bank = bank;
    }

    public boolean login(String cardNumber, int pin) {
       logout();
        return bank.findAccount(cardNumber)
                .filter(account -> account.validatePin(pin))
                .map(account -> {
                    currentAccount = account;
                    return true;
                })
                .orElse(false);

    }

    public void logout() {
        this.currentAccount = null;
    }
    public BigDecimal getUserBalance() {
        checkLogin();
        return currentAccount.getBalance();
    }
    public void checkLogin() {
        if (currentAccount == null) {
            throw new IllegalStateException("User not authorized");
        }
    }
    public boolean depositMoney(BigDecimal amount) {
        checkLogin();
        if(amount.compareTo(BigDecimal.ZERO) > 0) {
            currentAccount.depositMoney(amount);
            return true;
        }
        return false;
    }
    public boolean withdrawMoney(BigDecimal amount) {
        checkLogin();
        return currentAccount.withdrawMoney(amount);
    }
}
