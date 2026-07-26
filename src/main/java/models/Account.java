package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;

@AllArgsConstructor

public class Account {
    @Getter
    private String accountNumber;
    private int pinCode;
    @Getter
    private BigDecimal balance;

    public void depositMoney(BigDecimal amount) {
        if (amount != null && amount.compareTo(BigDecimal.ZERO) > 0) {
            this.balance = this.balance.add(amount);
        }
    }
    public boolean withdrawMoney(BigDecimal amount) {
        if (amount == null) {
            return false;
        }
        if (amount.compareTo(BigDecimal.ZERO) > 0 && balance.compareTo(amount) >= 0 ) {
            this.balance = this.balance.subtract(amount);
            return true;
        }
        return false;
    }
    public boolean validatePin(int pin) {
        return this.pinCode == pin;
    }
}

