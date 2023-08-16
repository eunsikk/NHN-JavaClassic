package Lambda;

import Lambda.BinaryOp;

public class TEST {

    public static void calc(BinaryOp binder, int i, int j) {
        System.out.println(binder.apply(j, i));
    }

    public static void main(String[] args) {
        // BinaryOp adder = new Adder();
        // adder.printArg();
        // adder.doIt();

        BinaryOp binder = new BinaryOp() {
            public int apply(int i, int j) {
                return i + j;
            }
        };

        // calc(binder, 1,2);

        // 람다식
        calc((i, j) -> i + j, 1, 2);
    }
}
