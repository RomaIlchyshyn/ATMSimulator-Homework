package dataProviders;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {
    @DataProvider(name = "credentials")
    public static Object[][] userCredentials() {
        return new Object[][] {
                {"4512", 1234},
                {"1111", 1111},
                {"9999", 7777}
        };
    }
}
