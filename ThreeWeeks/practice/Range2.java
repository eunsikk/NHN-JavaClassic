package ThreeWeeks.practice;

public class Range2 {

    private int getUpperBound;
    private int getLowerBound;

    public Range2(int getLowerBound, int getUpperBound) {
        this.getLowerBound = getLowerBound;
        this.getUpperBound = getUpperBound;
    }

    public Range2(int getUpperBound) {
        this(0, getUpperBound); // 밑의 주석 두 줄을 간소화한 것임.
        // this.getLowerBound = 0;
        // this.getUpperBound = getUpperBound;
    }

    public int getGetUpperBound() {
        return this.getUpperBound;
    }

    public int getGetLowerBound() {
        return this.getLowerBound;
    }


}
