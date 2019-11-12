package dssc.roman;

public class RomanNumeral {
    private final int decimal;

    public RomanNumeral(int decimal) {
        this.decimal=decimal;
    }

    @Override
    public String toString() {
        if (decimal==0) {
            return "";
        } else  if (decimal==1) {
            return "I";
        } else {
            return "II";
        }
    }
}
