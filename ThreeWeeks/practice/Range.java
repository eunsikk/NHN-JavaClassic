package ThreeWeeks.practice;

public class Range {

    private int From;
    private int To;

    public Range(int From, int To) {
        this.From = From;
        this.To = To;
    }

    public Range(int to) {
        this.From = 0;
        this.To = to;
        // this(0,to);
    }

    public int getTo() {
        return this.To;
    }

    public int getFrom() {
        return this.From;
    }

}
