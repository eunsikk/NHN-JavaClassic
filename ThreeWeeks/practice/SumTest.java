package ThreeWeeks.practice;

public class SumTest {
    public static void main(String[] args) {
        System.out.println(sum(5, 9, 7, 2, 9, 3, 8, 4));
        System.out.println(sum(5, 10));
        System.out.println(sum(10));
        System.out.println(sum(new Range2(5, 10)));
        System.out.println(sum(new Range2(10)));
        System.out.println(product(5, 9, 3, 2));
    }

    private static int reduce(다중연산 연산, int init, int... numbers) {
        int result = init;
        for (int number : numbers) {
            result += 연산.연산해(result, number);
        }
        return result;
    }

    private static int sum(int... numbers) {
        return reduce(new Plus(), 0, numbers);
    }

    private static int product(int... numbers) {
        return reduce(new Product(), 1, numbers);
    }

    // private static int product(int... numbers) { // 곱하기
    // int result = 1;

    // for (int number : numbers)
    // result *= number;
    // return result;
    // }

    // private static int sum(int... numbers) { // 여러 수 더하기
    // int result = 0;

    // for (int number : numbers)
    // result += number;
    // return result;
    // // for (int i=0; i<numbers.length; i++) {
    // // result +=
    // // }
    // }

    private static int sum(int numbers) { // 시그마 더하기
        return sigma(numbers);
    }

    private static int sigma(int numbers) {
        return numbers * (numbers + 1) / 2;
    }

    private static int sum(Range2 Range2) { // 범위와 범위 사이 더하기기
        return sum(Range2.getGetUpperBound()) - sum(Range2.getGetLowerBound() - 1);
    }
}
