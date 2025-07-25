package JAVA.Scanner;

import java.util.Scanner;

public class Sc1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer number");
        int a= sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Enter any String");
        String s=sc.next();

        System.out.println("int is "+a);
        System.out.println("int is "+b);
        System.out.println("string is "+s);
    }
}
