package newgenerics;

public class Student implements Members {
    // 객체에 대한 State(정보)를 구현
    private int studentNo;
    private String studentName;

    public Student(int studentNo, String studentName) {
        this.studentNo = studentNo;
        this.studentName = studentName;
    }

    public int getNo() {
        return this.studentNo;
    }

    public String getName() {
        return this.studentName;
    }

    @Override
    public String toString() {
        return this.studentNo + " " + this.studentName;
    }

    // 번호기준으로 맴버의 소속인 학생들을 정렬을 정의
    @Override
    public int compareTo(Members student) {
        if (this.studentNo > student.getNo()) {
            return 1;
        } else if (this.studentNo < student.getNo()) {
            return -1;
        } else {
            return 0;
        }
    }
}
