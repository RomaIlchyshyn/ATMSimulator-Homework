package helpers;

import base.BaseTest;
import com.github.javafaker.Faker;
import service.ATMService;

import java.math.BigDecimal;

public class TestData extends BaseTest {
    public static BigDecimal amount(int amount) {
        return BigDecimal.valueOf(amount);
    }

    public static BigDecimal amount(double amount) {
        return BigDecimal.valueOf(amount);
    }

    static Faker faker = new Faker();

    public static String generateRandomCard() {
        return faker.finance().creditCard();
    }

    public static int generateRandomPinCode() {
        return Integer.parseInt(faker.numerify("####"));
    }

    public static BigDecimal generateRandomWithdrawAmount(ATMService service) {
        return BigDecimal.valueOf(faker.number().randomDouble(2, 0, service.getUserBalance().longValue()));
    }
    public static int generateRandomPositiveDepositAmount(ATMService service) {
        return (int) faker.number().randomNumber();
    }
}
