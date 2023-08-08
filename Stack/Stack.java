public class Stack<T> {
    T[] elements;
    int index = 0;

    @SuppressWarnings("unchecked")
    public Stack(int size) {
        this.elements = (T[]) new Object[size];
    }

    public T push(T value) {
        T result = this.elements[index] = value;
        this.index++;
        return result;
    }


    public T pop() {
        return elements[--index];
    }

    // public int pop() {
    // int value = this.stack[--this.index];
    // return value;
    // }
}


class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>(5);
        Stack<String> stack2 = new Stack<String>(5);
        // Stack<Zealot> stack3 = new Stack<Zealot>(2);
    }
}
