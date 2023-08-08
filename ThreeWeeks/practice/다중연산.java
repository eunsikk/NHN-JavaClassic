package ThreeWeeks.practice;

public abstract class 다중연산 {

    public abstract int 연산해(int x, int y);
}


class Plus extends 다중연산 {

    @Override
    public int 연산해(int x, int y) {
        return x + y;
    }
}


class Product extends 다중연산 {

    @Override
    public int 연산해(int x, int y) {
        return x * y;
    }
}
