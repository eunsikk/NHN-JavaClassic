public class ValueSample {
    public static void changeValue(int i) {
        i = 10;
    }
    public static void main(String[] args){
        int i = 5;
        System.out.println(i);
        changeValue(i);
        System.out.println(i);    
    }
}