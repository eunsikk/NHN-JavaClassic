import java.util.Scanner;

public class Utilities {
    public static int max(int x, int y) {
        return x > y ? x : y;
    }
}


class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int j;

        System.out.println("첫 번째 숫자를 입력해주세요");
        i = scanner.nextInt();
        System.out.println("두 번째 숫자를 입력해주세요");
        j = scanner.nextInt();

        int max = Utilities.max(i, j);
        System.out.printf("숫자 %d과 숫자 %d중 더 큰 숫자는 %d입니다.\n", i, j, max);
    }
}
