import java.util.Scanner;

public class test {
    public static void main(String[] args){
        float celsius, fahr;

        try (Scanner F = new Scanner(System.in)) {
            System.out.println("화씨온도를 입력해주세요: ");

            fahr = (float)F.nextFloat();
        }
        celsius = (fahr - 32) * (5.0f / 9.0f);
        
        System.out.println(celsius);
    }   
}