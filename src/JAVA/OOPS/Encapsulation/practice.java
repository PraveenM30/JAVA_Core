package JAVA.OOPS.Encapsulation;

public class practice {
    private String name;
    private Double salary;
    private String EID;

    public Double getsalary() {
        return salary;
    }

    public void setSalary(Double SALARY) {
        this.salary = SALARY;
    }
    practice(Double salary){
        this.salary=salary;
    }

    public static void main(String[] args) {
        practice p=new practice(300000.0);
        System.out.println(p.getsalary());
        p.setSalary(120000.004);
        System.out.println(p.getsalary());
    }
}
