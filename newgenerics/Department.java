package newgenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Department<E extends Members> implements Iterable<E> {
    // Department 클래스는 맴버들 (학생, 교수)를 추가, 삭제, 정렬과 같이 Behavior(행위)를 구현
    private String name;
    List<E> members;

    public Department() {
        this.members = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void add(E members) {
        this.members.add(members);
    }

    // 숫자 정렬하는 sort 구현
    public void sort() {
        Collections.sort(this.members);
    }

    // 이름으로 정렬하는 sort 구현
    public void sort(Comparator<Members> comparator) {
        Collections.sort(this.members, comparator);
    }

    @Override
    public Iterator<E> iterator() {
        return this.members.iterator();
    }
}
