public class Recur {

    public static void main(String[] args) {
        // recursive(10);
        System.out.println(factorial(5));
        System.out.println(recursiveFactorial(5));
    }

    // public static void recursive(int i) {
    // if (i < 1) {
    // return;
    // } else {
    // System.out.println(i);
    // recursive(i - 1);
    // }

    public static int factorial(int value) {
        int result = 1;
        for (int i = 1; i < value + 1; i++) {
            result = result * i;
        }
        return result;
    }

    public static int recursiveFactorial(int value) {
        if (value <= 1) {
            return value;
        } else {
            return recursiveFactorial(value - 1) * value;
        }
    }
}
