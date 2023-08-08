import java.util.Scanner;

public class Sample {
    public static int add(int i, int j) {
        return i +j;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        

        int result = i / j;

        System.out.println(result);
        scanner.close();
    }
}


class Test{
    public static void main(String[] arg){
        System.out.println(Sample.add(1,2));
    }
}