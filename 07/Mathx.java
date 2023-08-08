public class Mathx {
    public static void main(String[] args) {
        System.out.println(Mathx.getVolume(2));
        System.out.println(Mathx.sigma(4));
        System.out.println(Mathx.even(2));
        System.out.println(Mathx.odd(2));
        System.out.println(Mathx.random(2, 20));
    }
//--------------------------------------------------------
    public static double getVolume(int radius) {
        double PI = 3.14;
        return radius * radius * radius * 4 * PI / 3;
    }
//--------------------------------------------------------
    public static int sigma(int n) {
        int result = n * (n + 1) / 2;
        if (n<=0){
            System.err.printf("Error : %d <= 0%n", n);
            System.exit(1);
        }
        if (result <= 0){
            System.err.printf("Error : %d는 최댓값을 넘어갔다.%n",n);
            System.exit(1);
        }
        return result;
    }
//--------------------------------------------------------
    public static boolean even(int e) {
        return e % 2 == 0;
    }
//--------------------------------------------------------
    public static boolean odd(int o) {
        return o % 2 == 0;
    }
//--------------------------------------------------------
    public static int random(int min, int max) {
        return (int) (Math.random() * Integer.MAX_VALUE + 1);
    }
    //이거 나중에 고쳐라
}