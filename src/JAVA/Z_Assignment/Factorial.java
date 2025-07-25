package JAVA.Z_Assignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        int fact=1;
        for(int i=num;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(num +" factorial is = "+fact);
    }
}