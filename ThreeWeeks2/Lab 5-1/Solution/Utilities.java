import java.util.Scanner;

public class Utilities {
    public static void swap(int i, int j) {
        int temp = i;
        j = temp;
        i = j;

    }
}


class Test {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;

        System.out.printf("swap 전 : %d %d\n", i, j);
        Utilities.swap(i, j);
        System.out.printf("swap 후 : %d %d\n", i, j);
    }
}
