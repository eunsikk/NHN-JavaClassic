package Generics.Department;

import java.util.Iterator;

public class DepartmentIterator<T> implements Iterator<T> {
    Department<T> department;
    int index = 0;

    public DepartmentIterator(Department<T> department) {
        this.department = department;
    }

    public boolean hasNext() {
        if (index >= department.stduents.length) {
            return false;
        } else {
            return true;
        }
    }

    public T next() {
        return department.stduents[index++];
    }
}
