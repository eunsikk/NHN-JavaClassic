public class ValueSample4 {
    public static void swap(int [] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
    public static void main(String[] args){
        int[] array = {5,6};
        swap(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
    }
}