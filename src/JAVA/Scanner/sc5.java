package JAVA.Scanner;

import java.util.Scanner;

public class sc5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Name!");
        String s=sc.next();
        System.out.println(s+" is my Name!!");

        //String to Array.
        char[] c=s.toCharArray();
        for (int i = 0; i <c.length ; i++) {
            System.out.println(c[i]);
        }
    }
}
