package JAVA.Z_Assignment;

import java.util.Scanner;
public class reverseNumber_StringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Characters");
        String a = sc.next();
        
        StringBuilder s = new StringBuilder(a);
        s.reverse();
        System.out.println(s);
    }
}