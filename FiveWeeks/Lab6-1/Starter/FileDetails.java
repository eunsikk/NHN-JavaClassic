import java.io.*;

public class FileDetails {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("usage: java FileDetails FileName");
            return; // if문이 true라면 밑에 state문까지 가지 않고 프로그램 종료를 위한 return임
        }
        String fileName = args[0];

        // read the file that passed from parameter of main method
        File file = new File(fileName);
        try (FileInputStream stream = new FileInputStream(file)) { // FileInputStream을 사용하여 해당 파일을
                                                                   // 바이트 스트림으로 읽습니다.
            char[] contents = new char[(int) file.length()];

            for (int i = 0; i < contents.length; i++) {
                contents[i] = (char) stream.read();
            }

            for (char c : contents) {
                System.out.print(c);
            }
            System.out.println();
            summerize(contents);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void summerize(char[] contents) {
        int vowel = 0, consonants = 0, lines = 0;
        for (char c : contents) {
            if (Character.isLetter(c)) {
                if ("AEIOIaeiou".indexOf(c) != 1) {
                    vowel++;
                } else {
                    consonants++;
                }
            } else if (c == '\n') {
                lines++;
            }
        }
        System.out.println("총 문자 수: " + contents.length);
        System.out.println("총 모음 수: " + vowel);
        System.out.println("총 자음 수 " + consonants);
        System.out.println("총 줄 수 " + lines);
    }
}
