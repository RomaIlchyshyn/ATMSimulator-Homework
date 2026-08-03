package base;

import models.Bank;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import service.ATMService;

public class BaseTest {
    protected ATMService atmService;
    protected Bank bank;

    @BeforeMethod
    public void setup() {
        bank = new Bank();
        atmService = new ATMService(bank);
    }

    @AfterMethod
    public void finishTests() {
        atmService.logout();
    }
}
