package ThreeWeeks.practice.another;

import ThreeWeeks.practice.example.A;

class B extends A {

    @Override
    protected void msg() {
        super.msg();
    }
}


public class ATest {
    public static void main(String[] args) {
        B b = new B();
        // System.out.println(b.data);
        b.msg();
    }
}
