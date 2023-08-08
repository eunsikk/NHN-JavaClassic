package ThreeWeeks.practice;

public class PassReferenceDataDemo {
    static class Circle {
        public int x;
        public int y;
        public int radius;

        Circle(int x, int y, int radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }

        public void move(int x, int y) {
            this.x += x;
            this.y += y;
        }

        public void print() {
            System.out.println("(" + x + ", " + y + ", " + radius + ")");
        }
    }

    public static void move(Circle c, int x, int y) {
        c.move(x, y);
        // c.x = 5;
        // c = new Circle(4, 5, 3);
    }

    public static void main(String[] args) {
        // float number = 1.0F;
        // Circle circle2 = null;
        // circle2.move(5, 4);
        // System.out.println(number);
        // System.out.println(circle2);
        Circle circle = new Circle(10, 10, 20);

        circle.print();

        move(circle, 5, 5);

        circle.print();
    }
}
