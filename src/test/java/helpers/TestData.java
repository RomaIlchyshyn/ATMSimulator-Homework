package helpers;

import java.math.BigDecimal;

public class TestData {

    private TestData() {

    }
    public static final String FIRST_VALID_CARD = "4512";
    public static final int FIRST_CARD_VALID_PIN = 1234;
    public static final String SECOND_VALID_CARD = "1111";
    public static final int SECOND_CARD_VALID_PIN = 1111;
    public static final String THIRD_VALID_CARD = "9999";
    public static final int THIRD_CARD_VALID_PIN = 7777;

    public static final String INVALID_CARD = "9999";
    public static final int INVALID_PIN = 1111;

    public static final BigDecimal SMALL_AMOUNT = BigDecimal.ONE;
    public static final BigDecimal NORMAL_AMOUNT = BigDecimal.valueOf(100);
    public static final BigDecimal LARGE_AMOUNT = BigDecimal.valueOf(500000);
    public static final BigDecimal NEGATIVE_AMOUNT = BigDecimal.valueOf(-100);
    public static final BigDecimal ZERO_AMOUNT = BigDecimal.ZERO;
}
