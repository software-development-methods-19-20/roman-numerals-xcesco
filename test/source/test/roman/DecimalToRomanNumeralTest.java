package test.roman;


import org.junit.jupiter.api.Test;
import dssc.roman.RomanNumeral;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * To check value, use the <a href="https://www.calculatorsoup.com/calculators/conversions/roman-numeral-converter.php">online calculator</a>
 */
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

    @Test
    void number30IsXXX() {
        check(30, "XXX");
    }

    @Test
    void number99IsXXX() {
        check(99, "XCIX");
    }

    @Test
    void number199IsXXX() {
        check(99, "XCIX");
    }
}
