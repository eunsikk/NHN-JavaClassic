package ThreeWeeks.practice;

class A {

    // private A(){}
    public int data = 40;

    public void msg() {
        System.out.println("Data is " + data);
    }
}


public class AccessModifierTest {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.data);
        a.msg();
    }
}
