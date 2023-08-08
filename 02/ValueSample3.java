public class ValueSample3 {
    public static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }
    public static void main(String[] args){
        int i = 5;
        int j = 6;

        swap(i,j);

        System.out.println(i);
        System.out.println(j);
    }
}