package sk.peterrendek.springLearn2Code.utils;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;


class TaxTest {
    @Test
    void value100PlusTaxIs120() {
        assertEquals(BigDecimal.valueOf(120L).setScale(2),
                (Tax.addTax(BigDecimal.valueOf(100L))).setScale(2)
        );
    }

    @Test
    void value141PlusTaxIs169dot2() {
        assertEquals(BigDecimal.valueOf(169.2).setScale(2),
                (Tax.addTax(BigDecimal.valueOf(141L))).setScale(2)
        );
    }

    @Test
    void value10PlusTaxIsNot1000() {
        assertNotEquals(BigDecimal.valueOf(1000).setScale(2),
                (Tax.addTax(BigDecimal.valueOf(10L))).setScale(2)
        );
    }
}