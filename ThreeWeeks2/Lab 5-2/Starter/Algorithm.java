class Adder {
    public int apply(int right, int left) {
        return right + left;
    }
}


class Multiplier {
    public int apply(int left, int right) {
        return left * right;
    }
}


public class Algorithm {

    final public static int addFrom1To10 = 55;

    public static int sigma(int begin, int end, int step) {
        return accmulate(null, step, begin, end, step);
    }

    public static int pi(int begin, int end, int step) {
        return accmulate(null, step, begin, end, step);
    }

    public static int accmulate(Multiplier binder, int init, int begin, int end, int step) {
        int result = init;
        for (int next = begin; next < end + 1; next = next + step) {
            result = binder.apply(result, next);
        }
        return result;
    }

    // public static int addFrom1To10(int x) {
    // int result = 0;
    // for (int i = 1; i < 10 + 1; i++) {
    // result += i;
    // }
    // return result;
    // }

    public static void main(String[] args) {
        // System.out.println(addFrom1To10);
        System.out.println(Algorithm.sigma(addFrom1To10, addFrom1To10, addFrom1To10));
        System.out.println(Algorithm.pi());
    }
}
