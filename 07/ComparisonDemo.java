public class ComparisonDemo{
    public static void main(String[] args) {
        int valueX = 1;
        int valueY = 2; // 변수의 이름은 귀찮더라도 잘 짓는 게 중요함. 
        if (valueX == valueY)
            System.out.println("valueX == valueY");
        if (valueX != valueY)
            System.out.println("valueX != valueY");
        if (valueX > valueY)
            System.out.println("valueX > valueY");
        if (valueX >= valueY)
            System.out.println("valueX >= valueY");
        if (valueX < valueY)
            System.out.println("valueX > valueY");
    }
}