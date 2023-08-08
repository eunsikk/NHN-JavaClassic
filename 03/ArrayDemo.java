public class ArrayDemo{    
    public static void print3DArray(String[][] array){
        for(String[] s: array) {
            printArray(s);
        }
        System.out.println();
    }

    public static void printArray(String[] array) {
        for(String s: array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String[][] names = {
            {"Mr", "Mrs", "Ms"},
            {"Smith","Jones"}
        };
        // System.out.println(names[0][0] + names[1][0]);
        print3DArray(names);
    }
}
        // int[] anArray;
        // anArray = new int[10];
        // anArray[0] = 100;
        // anArray[1] = 200;
        // anArray[2] = 300;
        // anArray[3] = 400;
        // anArray[4] = 500;
        // anArray[5] = 600;
        // anArray[6] = 700;
        // anArray[7] = 800;
        // anArray[8] = 900;
        // anArray[9] = 1000;

        // System.out.println("Element at index 0:" + anArray[0]);
        // System.out.println("Element at index 1:" + anArray[1]);
        // System.out.println("Element at index 2:" + anArray[2]);
        // System.out.println("Element at index 3:" + anArray[3]);
        // System.out.println("Element at index 4:" + anArray[4]);
        // System.out.println("Element at index 5:" + anArray[5]);
        // System.out.println("Element at index 6:" + anArray[6]);
        // System.out.println("Element at index 7:" + anArray[7]);
        // System.out.println("Element at index 8:" + anArray[8]);
        // System.out.println("Element at index 9:" + anArray[9]);
        
        // int[] anArray = new int[10];
        // System.out.println(anArray[10]);

        // int[] array = {100,200,300,400,500,600};
        // System.out.println(array[2]);