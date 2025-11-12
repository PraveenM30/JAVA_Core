package JAVA.Z_Assignment;

import java.util.Scanner;
public class reverseNumber_StringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        String a = sc.next();
        StringBuilder rev;
        StringBuilder s = new StringBuilder(a);
        rev = s.reverse();
        System.out.println(rev);
    }
}