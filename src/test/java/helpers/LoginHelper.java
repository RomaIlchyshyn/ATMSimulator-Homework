package helpers;

import service.ATMService;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LoginHelper {
    private LoginHelper() {

    }
    public static void successfulLogin(ATMService service) {
        boolean result = service.login(TestData.FIRST_VALID_CARD, TestData.FIRST_CARD_VALID_PIN);
        assertThat(result).isTrue();
    }
}
