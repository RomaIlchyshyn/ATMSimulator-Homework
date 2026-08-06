package tests;

import base.BaseTest;
import helpers.LoginHelper;
import helpers.TestData;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;


public class LogoutTest extends BaseTest {

    @Test(groups = "logout")
    public void shouldLogoutUser() {
        LoginHelper.successfulLogin(atmService);
        atmService.logout();
        assertThatThrownBy(() -> atmService.depositMoney(BigDecimal.TEN))
                .isInstanceOf(IllegalStateException.class).hasMessage(TestData.ERROR_MESSAGE);
    }
}
