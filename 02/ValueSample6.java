public class ValueSample6{
    public static int i=2;
    public static int j=3;

    static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }
    public static void main(String[] args){
        swap(1,2);
        System.out.printf("%d, %d\n",i,j);
    }
}