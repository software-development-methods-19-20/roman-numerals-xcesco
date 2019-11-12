package dssc.roman;


import static java.lang.String.format;

public class RomanNumeral {
    private final int decimal;

    private static String[] UNIT_SYMBOLS={"", "I", "II","III","IV","V","VI","VII","VIII","IX"};
    private static String[] DOZEN_SYMBOLS={"", "X", "XX", "XXX", "XL","L","LX","LXX","LXXX","XC"};
    private static String[] HUNDREDS_SYMBOLS={"", "C", "CC", "CCC", "CD","D","DC","DCC","DCCC","CM"};
    private static String[] THOUSAND_SYMBOLS={"", "M", "MM", "MMM"};


    public RomanNumeral(int decimal) {
        int MAX_VALUE = 3999;
        int MIN_VALUE = 0;
        if (decimal> MAX_VALUE || decimal< MIN_VALUE) {
            throw new RuntimeException(format("The number must be between %s and %s", MIN_VALUE, MAX_VALUE));
        }

        this.decimal = decimal;
    }

    @Override
    public String toString() {
        return  THOUSAND_SYMBOLS[decimal/1000]+
                HUNDREDS_SYMBOLS[(decimal % 1000) / 100]+
                DOZEN_SYMBOLS[(decimal % 100) / 10]+
                UNIT_SYMBOLS[decimal % 10];
    }
}
