package Lambda;

@FunctionalInterface
public interface BinaryOp {
    // static void printName() {
    // System.out.println("Celine");
    // }

    // default void printAge() {
    // System.out.println(33);
    // }

    // void doIt();

    int apply(int left, int right);
}


class Adder implements BinaryOp {
    public int apply(int left, int right) {
        return left + right;
    }
}


class Test {
    public static void main(String[] args) {
        BinaryOp add = (i, j) -> {
            int result = i + j;
            System.out.println(i + " + " + j + " = " + result);
            return result;
        };

        BinaryOp subtract = (i, j) -> {
            int result = i - j;
            System.out.println(i + " - " + j + " = " + result);
            return result;
        };

        BinaryOp multiply = (i, j) -> {
            int result = i * j;
            System.out.println(i + " * " + j + " = " + result);
            return result;
        };

        BinaryOp divide = (i, j) -> {
            if (j != 0) {
                int result = i / j;
                System.out.println(i + " / " + j + " = " + result);
                return result;
            } else {
                System.out.println("Cannot divide by zero!");
                return 0;
            }
        };

        BinaryOp max = (i, j) -> {
            int result = i > j ? i : j;
            System.out.println("Max of " + i + " and " + j + " = " + result);
            return result;
        };

        BinaryOp min = (i, j) -> {
            int result = i < j ? i : j;
            System.out.println("Min of " + i + " and " + j + " = " + result);
            return result;
        };

        int a = 10, b = 5;
        add.apply(a, b);
        subtract.apply(a, b);
        multiply.apply(a, b);
        divide.apply(a, b);
        max.apply(a, b);
        min.apply(a, b);
    }
}
