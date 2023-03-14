package sk.peterrendek.springLearn2Code.utils;

import java.math.BigDecimal;

public class Tax {
    private static final int tax =20;

    public static BigDecimal addTax(BigDecimal value){
        return value.multiply(BigDecimal.valueOf(1.2));
    }
}
