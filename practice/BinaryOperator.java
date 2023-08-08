package practice;

public interface BinaryOperator {
    public int evaluate(int result, int number);
}


class Plus implements BinaryOperator {
    public int evaluate(int x, int y) {
        return x + y;
    }
}


class Product implements BinaryOperator {
    public int evaluate(int x, int y) {
        return x * y;
    }
}
