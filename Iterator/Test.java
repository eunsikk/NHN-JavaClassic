public class Test {
    public static void main(String[] args) {
        Lecture<Student> l1 = new Lecture<>(5);
        l1.add(new Student(1, "Celine", "CE"));
        l1.add(new Student(2, "Clementine", "CE"));
        l1.add(new Student(3, "Helema", "CE"));
        l1.add(new Student(4, "Marline", "CE"));
        l1.add(new Student(5, "Jenny", "CE"));

        for(Student s: l1) {
            System.out.println(s);
        }
    }
}
