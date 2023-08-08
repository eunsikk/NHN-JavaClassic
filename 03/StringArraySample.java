public class StringArraySample {
    public static void printArray(String[] array) {
        for( String element : array ) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void print2DArray(String[][] array) {
        for(String[] outerElement : array) {
            printArray(outerElement);
        }        
    }

    public static void main(String[] args) {
        String[][] names = {
            {"Mr", "Mrs", "Ms"},
            {"Smith","Jones"}
        };
        
        for(String[] outerElement : names) {
            for (String element : outerElement) {
                System.out.print(element + " ");
            }
            System.out.println(); // 줄바꿈용
        }
        
        // System.out.println(names[0][0]);

        // String[] array = {"Celine", "Vesper"};
        // array[1] = "Clementina";
        // printArray(array);
        }
    }
