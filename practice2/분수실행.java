package practice2;

import java.util.Arrays;

class 분수 {

    int[] field;

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static 분수 분수(int 분자, int 분모) {
        if (분모 == 0)
            throw new ArithmeticException("분모가 0임");

        int v = gcd(분자, 분모);
        분수 that = new 분수();
        that.field = new int[2];
        that.field[0] = 분자 / v;
        that.field[1] = 분모 / v;

        return that;

    }

    public static int 분자(분수 x) {
        return x.field[0];
    }

    public static int 분모(분수 x) {
        return x.field[1];
    }
}


class 분수연산 {

    public static boolean equals(분수 x, 분수 y) {
        return 분수.분자(x) == 분수.분자(y) && 분수.분모(x) == 분수.분모(y);
    }

    public static 분수 add분수(분수 x, 분수 y) {
        // int z분모 = x분모 * y분모;
        // int z분자 = x분자 * y분자 + x분자 * x분모
        return 분수.분수((분수.분자(x) * 분수.분모(y) + 분수.분자(y) * 분수.분모(x)), (분수.분모(x) * 분수.분모(y)));
    }

    public static String toString(분수 x) {
        return 분수.분자(x) + "/" + 분수.분모(x);
    }
}


public class 분수실행 {
    public static void main(String[] args) {
        // 분수 x,y의 정의
        분수 x = 분수.분수(1, 4);
        분수 y = 분수.분수(2, 8);
        // 분수 x와 y는 같은가?
        System.out.println(분수연산.equals(x, y));
        분수 z = 분수연산.add분수(x, y);
        System.out.println(분수연산.toString(z));
    }
}

