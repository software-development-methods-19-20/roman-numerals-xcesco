package dssc.roman;

public class RomanNumeral {
    private final int decimal;

    private static String[] UNIT_SYMBOLS={"", "I", "II","III","IV","V","VI","VII","VIII","IX"};
    private static String[] DOZEN_SYMBOLS={"", "X", "XX", "XXX", "LX","L","LX","LXX","LXXXX","XC"};


    public RomanNumeral(int decimal) {
        this.decimal=decimal;
    }

    @Override
    public String toString() {
       // String temp="";
        return DOZEN_SYMBOLS[(decimal % 100) / 10] +UNIT_SYMBOLS[decimal % 10];
    }
}
