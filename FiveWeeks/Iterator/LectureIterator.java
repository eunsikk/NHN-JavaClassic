import java.util.Iterator;

public class LectureIterator<E> implements Iterator<E> {
    Lecture<E> lecture;
    int index = 0;

    public LectureIterator(Lecture<E> lecture) {
        this.lecture = lecture;
    }

    public boolean hasNext() {
        if (this.index >= lecture.elements.length) { // 다음이 있는지 확인하고 있으면 true, 없으면 false를 반환한다.
            return false;
        } else {
            return true;
        }
    }

    public E next() {
        return lecture.elements[this.index++]; // 요소 값을 리턴하고 계속해서 index++를 통해 다음 요소를 반환한다.
    }
}
