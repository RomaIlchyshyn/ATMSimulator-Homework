package helpers;

import base.BaseTest;
import service.ATMService;

public class SuccessfulLogin extends BaseTest {
    public void successfulLogin(ATMService service) {
        service.login("4512", 1234);
    }
}
