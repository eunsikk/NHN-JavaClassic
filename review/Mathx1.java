package review;

public class Mathx1 {
    public static double Pi = 3.14159;

    public static double sphereVolume(double r) {
        return (4.0/3.0) * Pi * Math.pow(r, 3);
    }

    public static int random(int x, int y) {
        return (int)(Math.random() * (y-x) + x);
    }
    
    public static boolean even(int num) {
        return num % 2 == 0;
    }

    public static boolean odd(int x) {
        return x % 2 != 0;
    }
}
