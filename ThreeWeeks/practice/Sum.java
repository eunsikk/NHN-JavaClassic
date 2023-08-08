package ThreeWeeks.practice;

public class Sum {


    public static void main(String[] args) {
        System.out.println(sum(5, 9, 7, 2, 9, 3, 8, 4));
        System.out.println(sum(new Range(5, 10)));
        System.out.println(sum(new Range(10)));
        System.out.println(sum(5, 10));
        System.out.println(sum(10));
        System.out.println(product(5, 9, 3, 2));

        // subtyping - Liskov Substitution Principle (LSP)
        이항연산 연산 = new 더하기(); // 선언된 type은 이항연산이나, 실제 type은 더하기이므로 더하기는 acutal type이라고 한다.
        System.out.println(연산.계산해(4, 5) == 9);
        // Cannot make a static reference to the non-static method 계산해(int, int) from the type
        // 더하기Java(603979977)
        // static이라는 것은 컴파일 type이라 봐도 99% 맞는 이야기다.
        이항연산 연산2 = new 곱하기();
        System.out.println(연산2.계산해(4, 5) == 9);

    }

    private static int reduce(이항연산 연산, int init, int... numbers) {
        int result = init;
        for (int number : numbers)
            result = 연산.계산해(result, number);
        return result;
    }

    private static int sum(int... numbers) {
        return reduce(new 더하기(), 0, numbers);
    }

    private static int product(int... numbers) {
        return reduce(new 곱하기(), 1, numbers);
    }

    // private static int sum(int... numbers) {
    // int result = 0;
    // // for (int number : numbers) {
    // // result += number;
    // // }
    // for (int index = 0; index < numbers.length; index++) result += numbers[index]; return result;
    // }

    private static int sum(int number) {
        return sigma(number);
        // return sum(new Range(1, number)); // 이 함수를 사용하면 stackoverflow가 발생한다.(면밀하게 따라가볼 것)
        // return number * (number + 1) / 2; // ex) 숫자의 범위,갯수가 겹치면 전혀 다른 결과가 나온다.
        // 함수의 코드를 수정 및 개선하려고 할 때, 기존의 코드를 남겨둬야한다.
    }

    private static int sigma(int number) {
        return number * (number + 1) / 2;
    }

    private static int sum(Range range) { // 오버로딩을 사용해도 계산되는 의미를 잘 생각해야한다.
        return sum(range.getTo()) - sum(range.getFrom() - 1);
    }
}
