package test.roman;


import org.junit.jupiter.api.Test;
import dssc.roman.RomanNumeral;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecimalToRomanNumeralTest {
    @Test
    void zeroIsEmptyString() {
        RomanNumeral romanNumeral = new RomanNumeral(0);
        assertEquals("", romanNumeral.toString());
    }
}
