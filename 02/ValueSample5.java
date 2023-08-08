public class ValueSample5 {
    public int i;

    public static void main(String[] args) {
        ValueSample5 instance = new ValueSample5();
        instance.i = 0; // i 변수에 초기값 할당

        for (int j = 0; j < 5; j++) {
            instance.i += j; // i 변수에 j 값을 더함
        }

        System.out.println(instance.i);
    }
}
