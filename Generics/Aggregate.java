package Generics;

import java.util.List;
import java.util.ArrayList;;

public class Aggregate {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello, ");
        list.add("World, ");

        for (String s : list) {
            System.out.print(s + " \n");
        }
    }
}
