package 재반복;

public class IntegerIterator implements Iterator {
    Aggregate agg;
    int index = 0;

    public IntegerIterator(Aggregate agg) {
        this.agg = agg;
    }

    public boolean hasNext() {
        return this.index < agg.elements.length;
    }

    public int next() {
        return agg.elements[index++];
    }
}
