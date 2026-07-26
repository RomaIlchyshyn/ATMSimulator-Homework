package models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
public class Account {
    private String accountNumber;
    private int pinCode;
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
}

