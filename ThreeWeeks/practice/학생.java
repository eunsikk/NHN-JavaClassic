package ThreeWeeks.practice;

public class 학생 {


    @Override
    public String toString() {
        return "학생 [이름=" + 이름 + ", 학교=" + 학교 + "]";
    }



    private String 이름;
    private String 학교;

    public 학생(String 이름, String 학교) {
        this.이름 = 이름;
        this.학교 = 학교;
    }



    public static void main(String[] args) {
        학생 철수 = new 학생("철수", "이런 학교");
        학생 영희 = new 학생("영희", "저런 학교");
        System.out.println(철수);
        System.out.println(영희);
    }



    public String get이름() {
        return 이름;
    }



    public void set이름(String 이름) {
        this.이름 = 이름;
    }



    public String get학교() {
        return 학교;
    }



    public void set학교(String 학교) {
        this.학교 = 학교;
    }
}
