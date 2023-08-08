// import java.lang.System; // 자바에서 미리 만들어놓은 운영체제를 사용하겠다는 것임
import java.util.Scanner;

public class HelloWorldApp {
    private static int i = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력해주세요: ");
        String name = scanner.next();        
        System.out.println(name); // Display the value of i
        scanner.close();
    }
}



class Test extends HelloWorldApp {
    public static void main(String[] args) {
        System.out.println("Hello from World");
    }
}