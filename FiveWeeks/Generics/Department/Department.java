package Generics.Department;

import java.util.Iterator;

public class Department<T> implements Iterable<T> {
    T[] stduents;
    int departmentNo;
    String name;

    public Department(int size, int departmentNo, String name) {
        this.stduents = (T[]) new Object[size];
        this.departmentNo = departmentNo;
        this.name = name;
    }

    public Iterator<T> iterator() {
        return new DepartmentIterator<T>(this);
    }


}
