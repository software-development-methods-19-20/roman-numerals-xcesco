package test.roman;


import org.junit.jupiter.api.Test;
import dssc.roman.RomanNumeral;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecimalToRomanNumeralTest {
    @Test
    void zeroIsEmptyString() {
        check(0, "");
    }

    private void check(int i, String s) {
        RomanNumeral romanNumeral = new RomanNumeral(i);
        assertEquals(s, romanNumeral.toString());
    }

    @Test
    void oneIsI() {
        check(1, "I");
    }

    @Test
    void twoIsII() {
        check(2, "II");
    }

    @Test
    void threeIsIII() {
        check(3, "III");
    }
}
