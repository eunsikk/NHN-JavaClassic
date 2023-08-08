public class PrePostDemo {
    public static void main(String[] args) {
        int i = 3;
        i++; // i = i+1
        System.out.println(i); //4
        ++i;
        System.out.println(i); //5

        System.out.println(i++); // 전 i가 찍히고 더한다.
        System.out.println(++i); // 먼저 더하고 찍는다.
        System.out.println(i);

        // ++i++; <- 이와 같은 것은 불가능이다.
    }
}