package review;


public class TestMathx1 {
    public static void main(String[] args) {
        TestMathx1.testEven();
        TestMathx1.testOdd();
        // TestMathx1.testRandom();
    }

    // 무자비수 테스트
    
    private static void testRandom() {
        System.out.println(Mathx1.random(1,100));
    }

    // 짝수 테스트
    private static void testEven() {
        int num = Mathx1.random(1, 100);
        System.out.println(num + " is odd: " + Mathx1.odd(num));
    }

    // 홀수 테스트
    private static void testOdd() {
        int num = Mathx1.random(1, 100);
        System.out.println(num + " is odd: " + Mathx1.odd(num));
    }
}
