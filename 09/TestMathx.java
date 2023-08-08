public class TestMathx {
    public static void main(String[] args) {
        TestMathx.testGetVolume();
        TestMathx.testSigma();
        TestMathx.testEven();
        TestMathx.testOdd();
        TestMathx.testRandom();
        TestMathx.testFactorial();
    }

    private static void testFactorial() {
        Mathx.factorial(10);
        System.out.println(Mathx.factorial(10));
    }

    private static void testEven() {
        Mathx.even(10);
        System.out.println(Mathx.even(10));
    }

    private static void testRandom() {
        Mathx.random(2,3);
        System.out.println(Mathx.random(2,3));
    }

    private static void testOdd() {
        Mathx.odd(10);
        System.out.println(Mathx.odd(10));
    }

    private static void testGetVolume() {
        Mathx.getVolume(15);
        System.out.println(Mathx.getVolume(15));
    }

    private static void testSigma() {
        Mathx.sigma(10);
        System.out.println(Mathx.sigma(10));
    }
}