package practice;

public class Range {
    private int maxbound;
    private int minbound;

    public Range(int minbound, int maxbound) {
        this.minbound = minbound;
        this.maxbound = maxbound;
    }

    public Range(int maxbound) {
        this.maxbound = maxbound;
        this.minbound = 0;
    }

    public int getMaxbound() {
        return this.maxbound;
    }

    public int getMinbound() {
        return this.minbound;
    }
}
