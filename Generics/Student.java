public class Student {
    private int studentNo;
    private String studentName;
    private String department;

    public Student(int studentNo, String studentName, String department) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.department = department;
    }

    public String getStudentNo() {
        return Integer.toString(studentNo);
    }

    public String getStudentName() {
        return this.studentName;
    }

    public String getDepartment() {
        return this.department;
    }

    @Override
    public String toString() {
        return this.studentNo + " " + this.studentName + " " + this.department;
    }
}