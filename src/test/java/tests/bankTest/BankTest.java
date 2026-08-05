package tests.bankTest;

import base.BaseTest;
import helpers.TestData;
import models.Bank;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankTest extends BaseTest{
    private Bank bank;

    @BeforeMethod
    public void setUp() {
        bank = new Bank();
    }
    @Test
    public void shouldFindExistingAccount() {
        assertThat(bank.findAccount(TestData.FIRST_VALID_CARD)).isNotEmpty();
    }
    @Test
    public void shouldReturnEmptyOptionalForUnknownCard() {
        assertThat(bank.findAccount(TestData.INVALID_CARD)).isEmpty();

    }
    @Test
    public void shouldReturnCorrectAccount() {
        assertThat(bank.findAccount(TestData.FIRST_VALID_CARD).get().getAccountNumber()).isEqualTo("4512");
    }
}
