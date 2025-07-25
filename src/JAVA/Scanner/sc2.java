package JAVA.Scanner;

import java.util.Scanner;

public class sc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an character");
        int a = sc.nextInt();
        char[] ch = new char[a];
        System.out.println("Enter character!");

        for (int i = 0; i < ch.length; i++) {
            ch[i] = sc.next().charAt(0);
        }
        System.out.println("size of array is "+ch.length);
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
    }
}
