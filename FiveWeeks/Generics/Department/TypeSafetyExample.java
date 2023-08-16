package Generics.Department;

public class TypeSafetyExample {

    public static class Box<T> { // T는 타입 파라미터입니다.
        private T item;

        public void set(T item) {
            this.item = item;
        }

        public T get() {
            return this.item;
        }
    }

    public static void main(String[] args) {
        Box<Student> box = new Box<Student>(); // 여기서 T는 String으로 정의됩니다.
        box.getStudentName("hello");

        // 이제 아래와 같은 코드는 컴파일 시점에 에러를 발생시킵니다.
        // Integer value = box.get();

        // 올바른 사용 방법:
        String value = box.get();
        System.out.println(value);
    }
}
