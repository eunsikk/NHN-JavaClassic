import java.util.Scanner;

public class KineticEnergy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1번째 자동차의 질량 M을 입력해주세요: ");
        double valueM = scanner.nextDouble();        

        System.out.println("1번째 자동차의 속력 V를 입력해주세요: ");
        double valueV = scanner.nextDouble();

        System.out.println("2번째 자동차의 질량 M을 입력해주세요: ");
        double valueM2 = scanner.nextDouble();        

        System.out.println("2번쨰 자동차의 속력 V를 입력해주세요: ");
        double valueV2 = scanner.nextDouble();
        System.out.println();

        double energy1 = Physics.kineticEnergy1(valueM, valueV);
        System.out.printf("1번째 자동차의 운동에너지는 %.2f입니다.\n", energy1);


        double energy2 = Physics.kineticEnergy2(valueM2, valueV2);
        System.out.printf("2번째 자동차의 운동에너지는 %.2f입니다.\n", energy2);
        System.out.println();

        Physics.booleanEnergy(energy1, energy2);
        System.out.printf("첫 번째 차량은 %b입니다\n",Physics.booleanEnergy(energy1, energy2));

        scanner.close();
    }
}
