package tests.accountTests;

import helpers.TestData;
import models.Account;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AccountTest {
    private Account account;

    @BeforeMethod
    public void setUp() {
        account = new Account(TestData.SECOND_VALID_CARD,
                TestData.SECOND_CARD_VALID_PIN,
                new BigDecimal("1000"));
    }
    @Test
    public void shouldDepositMoney() {
        account.depositMoney(new BigDecimal("200"));
        assertThat(account.getBalance()).as("Successful deposit")
                .isEqualByComparingTo("1200");
    }
    @Test
    public void shouldWithdrawMoney() {
        boolean result = account.withdrawMoney(new BigDecimal("300"));
        assertThat(result).isTrue();
        assertThat(account.getBalance()).as("Successful withdraw money")
                .isEqualByComparingTo("700");
    }
    @Test
    public void shouldNotWithdrawMoreThanBalance() {
        boolean result = account.withdrawMoney(new BigDecimal("2000"));
        assertThat(result).isFalse();
        assertThat(account.getBalance())
                .isEqualByComparingTo("1000");
    }
    @Test
    public void shouldValidatePin() {
        assertThat(account.validatePin(TestData.SECOND_CARD_VALID_PIN))
                .isTrue();
    }
    @Test
    public void shouldRejectInvalidPin() {
        assertThat(account.validatePin(5555))
                .isFalse();
    }
}
