package ThreeWeeks.practice;

public class MethodOverloadingDemo {
    public Number sum(Integer term1, Integer term2) { // public Number sum(Integer term1, Integer
                                                      // term2)
        System.out.println("Adding integers"); // 위의 코드 부분이 method signature라고 함.
        return term1 + term2;
    }

    public Number sum(Number term1, Number term2) {
        System.out.println("Adding numbers");
        return term1.doubleValue() + term2.doubleValue();
    }

    public Number sum(Object term1, Object term2) {
        System.out.println("Adding objects");
        return term1.hashCode() + term2.hashCode();
    }

    public static void main(String[] args) {
        MethodOverloadingDemo demo = new MethodOverloadingDemo();
        System.out.println(demo.sum(1, 2));
        System.out.println(demo.sum(1L, 2));
        System.out.println(demo.sum(demo, demo));
    }
}
