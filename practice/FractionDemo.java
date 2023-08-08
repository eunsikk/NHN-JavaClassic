package practice;

class Fraction {
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numerator;
        result = prime * result + denominator;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Fraction other = (Fraction) obj;
        return this.equals(other); // 이게 실무코드다(안전장치라고 보면 된다)
    }

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0)
            throw new ArithmeticException("denominator가 0");
        this.denominator = denominator;
        this.numerator = numerator;
        normalize();
    }

    private void normalize() {
        int v = gcd(this.numerator, this.denominator);
        this.numerator = this.numerator / v;
        this.denominator = this.denominator / v;
    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public int getDenominator() {
        return this.denominator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public boolean equals(Fraction that) {
        return this.getNumerator() == that.getNumerator()
                && this.getDenominator() == that.getDenominator();
    }

    @Override // compiler directive
    public String toString() {
        return this.getNumerator() + "/" + this.getDenominator();
    }

    public Fraction addFraction(Fraction that) {
        return new Fraction(
                this.getNumerator() * that.getDenominator()
                        + that.getNumerator() * this.getDenominator(),
                this.getDenominator() * that.getDenominator());
    }
}


public class FractionDemo { // Rational Number, Fractional Number
    public static void main(String[] args) {
        // Define fractions x and y
        Fraction x = new Fraction(1, 4);
        Fraction y = new Fraction(2, 8);

        System.out.println(x == y);
        // Are fractions x and y equal?
        System.out.println(x.equals(y));
        Fraction z = x.addFraction(y);
        System.out.printf("%s %n", z.toString());
    }
}
