public class ValueSample2 {
    public static void changeValue(int[] i) {
        i[1] = 20;
    }
    public static void main(String[] args){
        int[] array = {1,2,3};
        System.out.println(array[1]);
        changeValue(array);
        System.out.println(array[1]);    
    }
}