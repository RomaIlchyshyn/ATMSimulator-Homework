package sessionTest;

import base.BaseTest;
import helpers.TestData;
import org.testng.annotations.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class SessionTest extends BaseTest {

    @Test(groups = "session")
    public void shouldNotGetBalanceWithoutLogin() {

        assertThatThrownBy(() -> atmService.getUserBalance())
                .isInstanceOf(NullPointerException.class);
    }
    @Test(groups = "session")
    public void shouldNotDepositWithoutLogin() {

        assertThatThrownBy(() ->
                atmService.depositMoney(TestData.NORMAL_AMOUNT))
                .isInstanceOf(NullPointerException.class);
    }
    @Test(groups = "session")
    public void shouldNotWithdrawWithoutLogin() {

        assertThatThrownBy(() ->
                atmService.withdrawMoney(TestData.NORMAL_AMOUNT))
                .isInstanceOf(NullPointerException.class);
    }

}
