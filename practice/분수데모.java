package practice;

class 분수 {

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + 분자;
        result = prime * result + 분모;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        분수 other = (분수) obj;
        if (분자 != other.분자)
            return false;
        if (분모 != other.분모)
            return false;
        return true;
    }

    private int 분자;
    private int 분모;

    public 분수(int 분자, int 분모) {
        if (분모 == 0)
            throw new ArithmeticException("분모가 0");
        this.분자 = 분자;
        this.분모 = 분모;
        normalize();
    }

    private void normalize() {
        int v = gcd(this.분자, this.분모);
        this.분자 = this.분자 / v;
        this.분모 = this.분모 / v;
    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public int get분자() {
        return this.분자;
    }

    public int get분모() {
        return this.분모;
    }

    public boolean equals(분수 that) {
        // 분자(x) == 분자(y) && 분모(x) == 분모(y)
        return this.get분자() == that.get분자() && this.get분모() == that.get분모();
    }

    public 분수 add분수(분수 that) {
        // 분수(분수.분자(x) * 분수.분모(y) + 분수.분자(y) * 분수.분모(x), 분수.분모(x) * 분수.분모(y))
        return new 분수(this.get분자() * that.get분모() + this.get분모() * that.get분자(),
                this.get분모() * that.get분모());

    }

    public String toString() {
        // "" + 분수.분자(z) + "/" + 분수.분모(z)
        return this.get분자() + "/" + this.get분모();
    }
}


public class 분수데모 { // Rational Number, Fractional Number

    public static void main(String[] args) {
        // 분수 x,y의 정의
        분수 x = new 분수(1, 4);
        분수 y = new 분수(2, 8);

        System.out.println(x == y);
        // Are fractions x and y equal?
        System.out.println(x.equals(y));
        분수 z = x.add분수(y);
        System.out.printf("%s\n", z.toString());
    }
}
