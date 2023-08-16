package Lambda;

public class Adder implements BinaryOp {

    @Override
    public int apply(int left, int right) {
        return left + right;
    }

    // @Override
    // public void doIt() {
    // System.out.println("HE");
    // }
}
