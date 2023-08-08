public class Physics{

    public static double kineticEnergy1(double x, double y) {
        double value1 = 0.5 * x * Math.pow(y,2);
        return value1;
    }

    public static double kineticEnergy2(double x, double y) {
        double value2 = 0.5 * x * Math.pow(y,2);
        return value2;
    }

    public static boolean booleanEnergy(double energy1, double energy2) {
        return energy1 > energy2;
    }
}
