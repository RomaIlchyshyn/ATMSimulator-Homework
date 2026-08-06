package tests.sessiontest;

import base.BaseTest;
import helpers.TestData;
import org.testng.annotations.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class SessionTest extends BaseTest {

    @Test(groups = {"session"})
    public void shouldNotGetBalanceWithoutLogin() {

        assertThatThrownBy(() -> atmService.getUserBalance())
                .isInstanceOf(IllegalStateException.class).hasMessage(TestData.ERROR_MESSAGE);
    }
    @Test(groups = {"session"})
    public void shouldNotDepositWithoutLogin() {

        assertThatThrownBy(() ->
                atmService.depositMoney(TestData.NORMAL_AMOUNT))
                .isInstanceOf(IllegalStateException.class).hasMessage(TestData.ERROR_MESSAGE);
    }
    @Test(groups = {"session"})
    public void shouldNotWithdrawWithoutLogin() {

        assertThatThrownBy(() ->
                atmService.withdrawMoney(TestData.NORMAL_AMOUNT))
                .isInstanceOf(IllegalStateException.class).hasMessage(TestData.ERROR_MESSAGE);
    }

}
