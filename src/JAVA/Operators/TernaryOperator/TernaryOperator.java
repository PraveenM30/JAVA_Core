package JAVA.Operators.TernaryOperator;

public class TernaryOperator {
    public static void main(String[] args) {
        int a=10;
        int b=11;
        int c=12;
        int max=(a>b)?a:b;
        System.out.println(max +" is the maximum amoung 2 numbers !!");

        int Max1=(a>b)? ((a>c)?a:c): (b>c)?b:c;
        System.out.println(Max1+" is the maximum amoung 3 numbers !!");

    }
}
