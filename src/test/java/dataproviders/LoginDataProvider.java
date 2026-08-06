package dataproviders;

import helpers.TestData;
import org.testng.annotations.DataProvider;

public class LoginDataProvider {
    @DataProvider(name = "credentials")
    public static Object[][] userCredentials() {
        return new Object[][] {
                {TestData.FIRST_VALID_CARD, TestData.FIRST_CARD_VALID_PIN, true},
                {TestData.SECOND_VALID_CARD, TestData.SECOND_CARD_VALID_PIN, true},
                {TestData.THIRD_VALID_CARD, TestData.THIRD_CARD_VALID_PIN, true},
                {TestData.INVALID_CARD, TestData.FIRST_CARD_VALID_PIN, false},
                {TestData.FIRST_VALID_CARD, TestData.INVALID_PIN, false}
        };
    }
}
