import java.util.Iterator;

public class Lecture<E> implements Iterable<E> {
    E[] elements;
    int index;

    @SuppressWarnings("all")
    public Lecture(int size) {
        this.elements = (E[])new Object[size];
        this.index = 0;
    }

    public void add(E e) {
        if (this.index >= elements.length) {
            System.out.println("Full!");
            return;
        }
        else {
            this.elements[this.index++] = e;
        }
    }

    public E getElement(int index) {
        if (index > this.index) {
            System.out.println("Can't Access");
            return null;
        }
        else {
            return this.elements[index];
        }
    }

    public Iterator<E> iterator() {
        return new LectureIterator<E>(this);
    }
}
