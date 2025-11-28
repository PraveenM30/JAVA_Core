package JAVA.Z_Assignment;

import java.util.Scanner;

public class PalindromeExample {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.next();
        String org_str=str;
        String rev="";

        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(org_str.equalsIgnoreCase(rev)){
            System.out.println("It's a palindrome");
        }else{
            System.out.println("It's not a palindrome");
        }
    }
}