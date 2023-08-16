package newgenerics;


public class Professor implements Members {
    // 학생과 동일 +@ majer를 추가
    private int professorNo;
    private String professorName;
    private String majer;

    public Professor(int professorNo, String professorName, String majer) {
        this.professorNo = professorNo;
        this.professorName = professorName;
        this.majer = majer;
    }

    public int getNo() {
        return this.professorNo;
    }

    public String getName() {
        return this.professorName;
    }

    public String getDepartment() {
        return majer;
    }

    @Override
    public String toString() {
        return this.professorNo + " " + this.professorName + " " + this.majer;
    }

    // 번호기준으로 맴버의 소속인 교수들의 정렬을 정의
    @Override
    public int compareTo(Members professor) {
        if (this.professorNo > professor.getNo()) {
            return 1;
        } else if (this.professorNo < professor.getNo()) {
            return -1;
        } else {
            return 0;
        }
    }

}
