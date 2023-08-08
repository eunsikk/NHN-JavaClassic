import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(4, "Park", "CE");
        Student s2 = new Student(7, "Kim", "CE");
        Student s3 = new Student(2, "Lee", "CE");

        Student[] students = {s1, s2, s3};

        for (Student s : students)
            System.out.println(s);

        Arrays.sort(students);

        System.out.println("After Sorting:");

        for (Student s : students)
            System.out.println(s);

        // String s = "abc" + "abc";
        // System.out.println(s);
    }
}
