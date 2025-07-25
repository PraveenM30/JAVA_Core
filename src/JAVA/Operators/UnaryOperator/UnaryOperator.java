package JAVA.Operators.UnaryOperator;

public class UnaryOperator {
    public static void main(String[] args) {
        int a=1;
        int b=2;

        int c=--a + ++b + ++a + b++ + --b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
