public class MajorityTest1 {
    public static void main(String[] args) {
        testMajority();
    }

    private static void testMajority() {
        final boolean[] TF = { true, false};
        for (boolean first : TF)
            for (boolean second: TF)
                for (boolean third: TF)
                    System.out.printf("%b\t%b\t%b\t%b%n", first, second, third, MajorityTest1.majority(first,second,third));
    }

    private static boolean majority(boolean first, boolean second, boolean third) {
        boolean t = true;
        boolean f = false;
        if ((first==true && second==true) || (first==true && third==true) || (second==true && third==true)) {
            return t;
        }
        else
            return f;
    }
}
