public class Mathx2 {
    public final static double PI = 3.1415926535; //자바의 상수 선언은 final이다.
    
    public static double getCircum(double radius) {
        return 2 * PI * radius;
    }
        
    public static int sigma(int n) { //sigma는 int n을 받아서 int로 내놓는 type이다.
        return n * (n + 1) / 2;      //매써드도 결국 변수와 다를 게 없다. 선언+초기화를 통해 정의하는 것과 같다.
    }

    public static double sphereVolume(double radius) {
        return 4.0/3.0 * PI * Math.pow(radius,3);
    }

    public static int random(int x, int y) {
        return (int)(Math.random() * (y -x) + x);
    }

    public static int sumOfParameters(int... value) {
        int result = 0;
        for (int i:value) {
            result +=i;
        }
            return result;
    }

    public static void main(String[] args) {
        // System.out.println(Mathx.sigma(Integer.valueOf(args[0])));
        System.out.println(TestMathx.testSphereVolume(7));
        System.out.println(Mathx2.random(5,100));
    }

    
}

class TestMathx{
    public static double testSphereVolume(double radius) {
        return Mathx2.sphereVolume(radius);
    }

    public static void main(String[] args) {
        int result = Mathx2.sumOfParameters(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(result);
    }
}

// class mathx3 {
//     public final static double PI = 3.1415926535; //자바의 상수 선언은 final이다.
//     public static double circleArea(double radius) {
//         return PI * Math.pow(radius,2);
//     }

//     public static void main(String[] args) {
//         // System.out.println(Mathx.sigma(Integer.valueOf(args[0])));
//         System.out.printf("%.1f",mathx3.circleArea(10));
//     }
// }

// 메써드는 실행이 끝나고 나면 시마이, 도출된 결과값을 사용할 클래스로 return해준다. (반환할 값이 있을 때만)