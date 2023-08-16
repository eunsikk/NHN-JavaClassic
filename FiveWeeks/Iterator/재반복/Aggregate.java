package 재반복;

public class Aggregate implements Iterable {
    public int[] elements;

    public Aggregate() {
        this.elements = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    public void add(int index, int i) {
        if (index < 0 || index >= elements.length) {
            System.out.println("out of range");
        } else {
            this.elements[index] = i;
        }
    }

    public Iterator iterator() {
        return new IntegerIterator(this);
    }

    public static void main(String[] args) {
        Aggregate agg = new Aggregate();
        agg.add(5, 2);

        Iterator ii = agg.iterator();
        while (ii.hasNext()) {
            System.out.println(ii.next());
        }
    }
}
