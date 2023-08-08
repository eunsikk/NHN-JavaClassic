package ThreeWeeks.practice;

public class Bicycle { // 필드는 private으로 , 매써드는 public으로 선언해서 get과 set으로 접근하는 방식을 사용
    @Override
    public String toString() {
        return "Bicycle [speed=" + speed + "]";
    }

    private int cadence;
    private int gear;
    private int speed;

    public Bicycle(int cadence, int gear, int speed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
    }

    // make cardence field rw(readable and writable)
    public int getCadence() {
        return cadence;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    // make gear field rw(readable and writable)
    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUP(int increment) {
        speed += increment;
    }

    public static void main(String[] args) {
        Bicycle mine = new Bicycle(1000, 1, 60);
        mine.applyBrake(10);
        System.out.println(mine);
        mine.speedUP(10);
        System.out.println(mine);
    }
}
