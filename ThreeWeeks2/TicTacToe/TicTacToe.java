package ThreeWeeks2.TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void printboards(String[][] boards) {
        System.out.println("+---------------+");
        for (int i = 0; i < boards.length; i++) {
            for (int j = 0; j < boards.length; j++) {
                System.out.print("| ");
                System.out.print(boards[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
            System.out.println("+---------------+");
        }
    }

    public static void userPick(String[][] a1, int userx, int usery) {
        a1[userx][usery] = "O";
    }

    public static void computerPick(String[][] a1) {
        Random random = new Random();
        while (true) {
            int x = random.nextInt(3);
            int y = random.nextInt(3);
            if (a1[x][y] == " ") {
                a1[x][y] = "X";
                break;
            }
            if (gameIsFull(a1)) {
                break;
            }
        }
    }

    public static boolean gameIsFull(String[][] a1) {
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1.length; j++) {
                if (a1[i][j] == " ") {
                    return false;
                }
            }
        }
        return true;
    }

    public static String gamewinner(String[][] arr) {
        String result;
        if ((result = checkRows(arr)) != "" || (result = checkColumns(arr)) != ""
                || (result = checkDiagonals(arr)) != "") {
            return result;
        }
        return "";
    }

    private static String checkRows(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2] && arr[i][0] != " ") {
                return arr[i][0];
            }
        }
        return "";
    }

    private static String checkColumns(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i] && arr[0][i] != " ") {
                return arr[0][i];
            }
        }
        return "";
    }

    private static String checkDiagonals(String[][] arr) {
        if (arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2] && arr[0][0] != " ") {
            return arr[0][0];
        }
        if (arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0] && arr[0][2] != " ") {
            return arr[0][2];
        }
        return "";
    }

    public static void number(String[][] a1) {
        int result = 0;
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                result++;
                a1[i][j] = String.valueOf(result);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] a1 = new String[3][3];
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1.length; j++) {
                a1[i][j] = " ";
            }
        }

        printboards(a1);
        System.out.println();

        boolean endGame = true;
        while (endGame) {
            System.out.println("입력할 좌표값을 선택해주세요. (정수 x y를 입력)");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (!a1[x][y].equals(" ")) {
                System.out.println("이미 입력이 존재합니다.");
                continue;
            }
            userPick(a1, x, y);
            computerPick(a1);
            printboards(a1);

            String winner = gamewinner(a1);

            if (winner.equals("O")) {
                System.out.println("축하합니다!");
                endGame = false;

            } else if (winner.equals("X")) {
                System.out.println("패배했습니다");
                endGame = false;
            }
            if (gameIsFull(a1)) {
                System.out.println("비겼습니다");
                endGame = false;
            }
        }
        scanner.close();
    }
}
