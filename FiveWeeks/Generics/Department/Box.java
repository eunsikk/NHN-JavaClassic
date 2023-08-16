package Generics.Department;

public class Box<T> {
    T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}


class Test {
    public static void main(String[] args) {
        Box<String> box1 = new Box<String>("Hello");
        System.out.println(box1.getItem());

        Box<Integer> box2 = new Box<Integer>(100);
        System.out.println(box2.getItem());
    }
}
