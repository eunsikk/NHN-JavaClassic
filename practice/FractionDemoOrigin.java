package practice;

import java.util.Arrays;

class Fraction { // 유리수를 표현하는 방법이 없다. 그래서 함수적인 캡슐화로 클래스화 시켜서 데이터를 structure한다.

    int[] bowl;

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static Fraction Fraction(int numerator, int denominator) {
        if (denominator == 0)
            throw new ArithmeticException("분모가 0이야 임마");

        int v = gcd(numerator, denominator);
        Fraction that = new Fraction();
        that.bowl = new int[2];
        that.bowl[0] = numerator / v;
        that.bowl[1] = denominator / v;
        return that;
    }

    public static int numerator(Fraction x) {
        return x.bowl[0];
    }

    public static int denominator(Fraction x) {
        return x.bowl[1];
    }
}


class FractionEvaluate {

    public static boolean equals(Fraction x, Fraction y) {
        // return 분자(x) == 분자(y) && 분모(x) == 분모(y);
        return Fraction.numerator(x) == Fraction.numerator(y)
                && Fraction.denominator(x) == Fraction.denominator(y);
    }

    public static Fraction add분수(Fraction x, Fraction y) {
        return Fraction.Fraction(
                Fraction.numerator(x) * Fraction.denominator(y)
                        + Fraction.numerator(y) * Fraction.denominator(x),
                Fraction.denominator(x) * Fraction.denominator(y));
    }

    public static String toString(Fraction z) {
        return Fraction.numerator(z) + "/" + Fraction.denominator(z);
    }
}


public class FractionDemoOrigin { // 분수는 Rational Number 혹은 Fractional Number라고 부른다
    // private int 분자; // numerator
    // private int 분모; // denominator

    public static void main(String[] args) {
        // 분수 x,y의 정의
        Fraction x = Fraction.Fraction(1, 4); // [0] = x분자, [1] = x분모
        // int[] z = x; // aliasing(별명짓기) 또는 sharing
        Fraction y = Fraction.Fraction(2, 8); // [0] = y분자, [1] = y분모

        // 분수 x와 y는 같은가?
        System.out.println(FractionEvaluate.equals(x, y));
        Fraction z = FractionEvaluate.add분수(x, y);
        System.out.println(FractionEvaluate.toString(z));
    }
}
