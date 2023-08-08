public class Bicycle {
    private int cadence;
    private int gear;
    private int speed;
    private int id;

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public int getId() {
        return id;
    }

    public static void setNumberofBicycles(int numberofBicycles) {
        Bicycle.numberofBicycles = numberofBicycles;
    }

    private static int numberofBicycles = 0; // static은 공용변수로 사용될 수 있다. 왜? static이니까 고정으로 값이 메모리에 올라감.

    public Bicycle() {
        ++numberofBicycles;
    }
    
    public static int getNumberofBicycles() {
        return numberofBicycles;
    }

    public static void main(String[] args) {
        Bicycle.numberofBicycles = 0;
        System.out.println("Count of bicycles: " + Bicycle.numberofBicycles);

        Bicycle myBicycle = new Bicycle();
        System.out.println("Count of bicycles: " + Bicycle.numberofBicycles);

        Bicycle yourBicycle = new Bicycle();
        System.out.println("Count of bicycles: " + Bicycle.numberofBicycles);
    }
}