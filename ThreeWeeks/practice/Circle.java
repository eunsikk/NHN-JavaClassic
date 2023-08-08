package ThreeWeeks.practice;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() { // get과 set은 무작위로 만드는 것이 아니라, 만드는 이유를 잘 생각하고 만들어야 한다.
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void changeRadius(int radius, Circle c) {
        radius = 7;
        c.setRadius(7);
        System.out.println("함수 속에서" + radius + "," + c);
        c = new Circle(10);
        System.out.println("함수 속에서 c에 새로운 물건을 넣은 다음에" + c);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(4.0);
        int radius = 5;
        circle.setRadius(5.0);
        System.out.println("함수를 부르기 전에" + "//" + radius + "//" + circle);
        changeRadius(5, circle);
        System.out.println("함수를 부른 후에" + "//" + radius + "//" + circle);
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}
