package practice;

public class FractionAdd {
    public static void main(String[] args) {
        int A분자 = 1;
        int A분모 = 3;
        int B분자 = 1;
        int B분모 = 4;
        System.out.printf("%d/%d\n", A분자, A분모);
        System.out.printf("%d/%d\n", B분자, B분모);
        int C분모 = B분모 * A분모;
        int C분자 = (A분자 * B분모) + (B분자 * A분모);
        sum(A분자, A분모, B분자, B분모);
        int D분모 = C분모 * B분모;
        int D분자 = (C분모 * B분자) + (C분자 * B분모);
        sum(B분자, B분모, C분자, C분모);
    }

    public static void sum(int A분자, int A분모, int B분자, int B분모) {
        int C분모 = A분모 * B분모;
        int C분자 = (A분자 * B분모) + (B분자 * A분모);

        System.out.printf("%d/%d\n", C분자, C분모);
    }
}
