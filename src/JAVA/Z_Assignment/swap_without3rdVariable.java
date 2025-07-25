package JAVA.Z_Assignment;

public class swap_without3rdVariable {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a is "+a);
        System.out.println("b is "+b);
    }
}
