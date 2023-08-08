public class TestMathx {
    public static void main(String[] args) {
        TestMathx.testGetVolume();
        TestMathx.testSigma();
        TestMathx.testEven();
        TestMathx.testOdd();
        TestMathx.testRandom();
    }

    private static boolean testEven() {
        int i = Mathx.random(1, 100);
        System.out.println(i + "is even" + Mathx.even(i));
    }

    private static void testRandom() {
        Mathx.random(2,3);
        System.out.println(Mathx.random(2,3));
    }

    private static boolean testOdd() {
        int i = Mathx.random(1, 100);
        System.out.println(i + "is even" + odd(i));
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