public class practice {
    public static void Array1(String[][] array) {
        for( String[] s : array) {
            // System.out.println(s);
            Array2(s);
        }            
    }
    public static void Array2(String[] array) {
        for( String s : array) {
            System.out.println(s);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String[][] names = {
            {"박성우","최주환","김병민"},
            {"진지곤","박상원","배수빈"}
        };
        Array1(names);
    }
}
