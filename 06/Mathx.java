public class Mathx {
    public static float sigma(int n) {   //메서드에 static 키워드가 붙을 경우 이 메서드는 클래스 메서드가 되어 객체를 만들지 않아도 
        return n * (n + 1) / 2;          // “클래스명. 메서드명” 형태로 호출이 가능하다.
    }

    public static void main(String[] args) {
        System.out.println(Mathx.sigma(Integer.valueOf(args[0])));
    }
}

// import java.util.Scanner;

// public class Mathx {
//     public static int sigma(int n) {
//         return n * (n + 1) / 2;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("숫자를 입력해주세요");
//         int i = sc.nextInt();
//         System.out.println(Mathx.sigma(Integer.valueOf(args[0])));
//     }
// }
// 메써드는 실행이 끝나고 나면 시마이, 도출된 결과값을 사용할 클래스로 return해준다. (반환할 값이 있을 때만)

// public class Mathx {
//     public static int sigma(int n) {
//         return n * (n + 1) / 2;
//     }

//     public static void main(String[] args) {
//         if (args.length > 0) {
//             int i = Integer.parseInt(args[0]);
//             System.out.println(Mathx.sigma(i));
//         } else {
//             System.out.println("인수를 입력하지 않았습니다.");
//         }
//     }
// }