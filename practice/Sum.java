package practice;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(sum(10));
        System.out.println(sum(new Range(5, 10)));
        System.out.println(sum(new Range(10)));
        System.out.println(product(6, 8, 4, 3, 8, 9, 4, 3, 7));
        System.out.println(sameResult(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), sum(10)));
    }

    private static int reduce(BinaryOperator operator, int init, int... numbers) {
        int result = init;
        for (int number : numbers) {
            result = operator.evaluate(result, number);
        }
        return result;
    }

    private static int product(int... numbers) {
        int init = 1;
        return reduce(new Product(), init, numbers);

    }

    private static int sum(int... numbers) {
        int init = 0;
        return reduce(new Plus(), init, numbers);
    }

    private static int sigma(int numbers) {
        return numbers * (numbers + 1) / 2;
    }

    private static int sum(int numbers) {
        return sigma(numbers);
    }

    private static int sum(Range Range) {
        return sum(Range.getMaxbound()) - sum(Range.getMinbound() - 1);
    }

    private static boolean sameResult(int x, int y) {
        return sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) == sum(10);
    }
}


