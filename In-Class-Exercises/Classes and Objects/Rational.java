
public class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        numerator = 1;
        denominator = 1;
    }
    public Rational(int n, int d) {
    numerator = n;
    denominator = d;
    }
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setNumerator(int n) {
        numerator = n;
    }
    public void setDenominator(int d) {
        denominator = d;
    }
    public Rational add(Rational n2) {
        Rational value = new Rational(this.numerator*n2.denominator + n2.numerator*this.denominator, this.denominator*n2.denominator);
        return value;
    }
    public Rational subtract(Rational n2) {
        Rational value = new Rational(this.numerator*n2.denominator - n2.numerator*this.denominator, this.denominator*n2.denominator);
        return value;
    }
    public Rational multiply(Rational n2) {
        Rational value = new Rational(this.numerator*n2.numerator, this.denominator*n2.denominator);
        return value;
    }
    public Rational divide(Rational n2) {
        Rational value = new Rational(this.numerator*n2.denominator, n2.numerator*this.denominator);
        return value;
    }
    public String toString() {
        return numerator + "/" + denominator;
    }
    
}