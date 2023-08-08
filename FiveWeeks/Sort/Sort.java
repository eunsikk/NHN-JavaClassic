public class Sort {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 6, 2, 5, 7, 2, 4, 56, 24, 45};
        sort(array);
        for (int i : array) {
            System.out.print(i + " "); // print를 사용해 한 줄에 모든 요소를 출력
        }
        System.out.println(); // 마지막에 줄바꿈을 추가
    }
}
