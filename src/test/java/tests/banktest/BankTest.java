package tests.banktest;

import base.BaseTest;
import helpers.TestData;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankTest extends BaseTest{

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
