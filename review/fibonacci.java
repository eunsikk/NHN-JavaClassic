package review;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci.fibonacci1(8));
    }
    public static int fibonacci1(int n) {
        if (n<=1) {
            return n;
        }

        int result = 0; // F0 = 0, F1 = 1, F2 = 1, F3 = 2, F4 = 3 , F5= 5
        int previous0 = 0;
        int previous1 = 1;

        for (int i=2; i <=n; i++) {  // 
            result = previous1 + previous0;
            previous0 = previous1;
            previous1 = result;
        }
        return result;
    }
}

// public static int fibonacci1(int n) {
//     if (n==0) {
//         return 0;
//     } else if (n==1) {
//         return 1;
//     } else {
//         return fibonacci1(n-1) + fibonacci1(n-2);
//     }
// }
// }
