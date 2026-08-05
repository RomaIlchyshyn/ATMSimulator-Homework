package tests;

import base.BaseTest;
import helpers.LoginHelper;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class LogoutTest extends BaseTest {
    SoftAssertions softly = new SoftAssertions();

    @Test(groups = "logout")
    public void shouldLogoutUser() {
        LoginHelper.successfulLogin(atmService);
        atmService.logout();
        softly.assertThat(bank.getAccounts()).isNull();
    }
}
