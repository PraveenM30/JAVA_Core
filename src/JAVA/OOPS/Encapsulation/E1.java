package JAVA.OOPS.Encapsulation;

public class E1 {
    private String StudentName;

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudenName) {
        this.StudentName = StudenName;
    }

    E1(String studentName) {
        this.StudentName = studentName;
    }
}

class runner3 {
    public static void main(String[] args) {
        E1 e = new E1("Manoj");
        System.out.println("Before setting the Student name >>" + e.getStudentName());
        e.setStudentName("Praveen");
        System.out.println("After setting the Student name >>" + e.getStudentName());

    }
}
