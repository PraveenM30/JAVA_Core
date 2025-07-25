package JAVA.Z_Practice;

import java.util.Scanner;

public class Scanner1 {
    public static int add() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers");
        int a=sc.nextInt();
        double b=sc.nextDouble();
        double c=a+b;
        return (int) c;
    }

    public static void main(String[] args) {
        double cc=add();
        System.out.println(cc);
    }
}
