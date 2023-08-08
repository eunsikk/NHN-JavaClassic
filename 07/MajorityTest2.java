public class MajorityTest2 {
    public static void main(String[] args) {
        testMajority();
    }

    private static void testMajority() {
        final boolean[] TF = { true, false};
        for (boolean first : TF)
            for (boolean second: TF)
                for (boolean third: TF)
                    System.out.printf("%b\t%b\t%b\t%b%n", first, second, third, MajorityTest2.majority(first,second,third));
    }

    private static boolean majority(boolean first, boolean second, boolean third) {
        return (first && second) || (first && third) || (second && third);
    }
}