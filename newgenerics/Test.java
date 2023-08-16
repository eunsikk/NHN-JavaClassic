package newgenerics;

import java.util.Comparator;

public class Test {
    public static void main(String[] args) {

        // 객체를 선언
        Department<Student> l1 = new Department<>();
        // 제네릭 안에 있는 타입은 학생 객체만 넣을 수 있다는 뜻임 (런타임x 컴파일 에러 발생)
        l1.add(new Student(1, "B"));
        l1.add(new Student(2, "A"));
        l1.add(new Student(3, "C"));

        Department<Professor> l2 = new Department<>();
        // 제네릭 안에 있는 타입은 교수객체만 넣을 수 있다는 뜻임(런타임x 컴파일 에러 발생)
        l2.add(new Professor(3, "b", "CE"));
        l2.add(new Professor(1, "c", "CE"));
        l2.add(new Professor(2, "a", "CE"));

        // 객체를 열거
        System.out.println("Members List");
        for (Student s : l1) {
            System.out.println(s);
        }

        for (Professor p : l2) {
            System.out.println(p);
        }

        // 객체를 특정조건으로 정렬 (이름 기준으로 정렬)
        System.out.println("Members name sort");
        // l1.sort((Members m1, Members m2) -> m1.getName().compareTo(m2.getName()));
        // l2.sort((Members m1, Members m2) -> m1.getName().compareTo(m2.getName()));
        // 이건 lambda를 사용한 정의임.

        l1.sort(new Comparator<Members>() {
            @Override
            public int compare(Members m1, Members m2) {
                return m1.getName().compareTo(m2.getName());
            }
        });

        l2.sort(new Comparator<Members>() {
            @Override
            public int compare(Members m1, Members m2) {
                return m1.getName().compareTo(m2.getName());
            }
        });

        for (Student s : l1) {
            System.out.println(s);
        }

        for (Professor p : l2) {
            System.out.println(p);
        }

        // 정렬 (넘버를 기준으로 정렬) 정렬기준은 각 객체에서 정의
        l1.sort();
        l2.sort();

        System.out.println("Members number sort");
        for (Student s : l1) {
            System.out.println(s);
        }

        for (Professor p : l2) {
            System.out.println(p);
        }
    }
}
