package ThreeWeeks2.TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class TTT {


    public static void printGame(String[][] arr) {
        System.out.println();
        System.out.println("----------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
                System.out.print("  |  ");
            }
            System.out.println();
            System.out.println("----------------");
        }
    }

    public static void userPick(String[][] arr, int x, int y) {
        arr[x][y] = "O";
    }

    public static void computerPick(String[][] arr) {
        Random random = new Random();

        while (true) {
            int x = random.nextInt(3);
            int y = random.nextInt(3);
            if (arr[x][y] == " ") {
                arr[x][y] = "X";
                break;
            }
            if (gameIsFull(arr) == true) {
                break;
            }
        }
    }

    public static String gameWinner(String[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2] && arr[i][0] != " ") {
                return arr[i][0];
            }
            if (arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i] && arr[0][i] != " ") {
                return arr[0][i];
            }
        }

        if (arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2] && arr[0][0] != " ") {
            return arr[0][0];
        }

        if (arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0] && arr[0][2] != " ") {
            return arr[0][2];
        }

        return "";
    }


    public static boolean gameIsFull(String[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == " ") {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[][] arr = new String[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = " ";
            }
        }

        printGame(arr);
        System.out.println();

        boolean gameEnd = true;
        while (gameEnd) {
            System.out.println("선택할 좌표(x, y)를 입력해 주세요.");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (arr[x][y] != " ") {
                System.out.println("중복된 자리입니다.");
                continue;
            }
            userPick(arr, x, y);
            computerPick(arr);
            printGame(arr);

            String winner = gameWinner(arr);

            if (winner.equals("O")) {
                System.out.println("축하합니다. 게임에서 승리하였습니다!");
                gameEnd = false;
            } else if (winner.equals("X")) {
                System.out.println("아쉽게 게임에서 패배하였습니다.");
                gameEnd = false;
            }

            if (gameIsFull(arr) == true) {
                System.out.println("비겼습니다");
                gameEnd = false;
            }

        }
    }
}
