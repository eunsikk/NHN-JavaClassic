package ThreeWeeks.practice;

public class 산악자전거 extends Bicycle {

    private int seatHeight;

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public 산악자전거(int seatHeight, int cadence, int gear, int speed) {
        super(cadence, gear, speed); // ctor => 컨스턱터 줄임말
        this.seatHeight = seatHeight;
    }
}
