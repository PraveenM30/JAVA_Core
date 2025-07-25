package JAVA.Scanner;

import java.util.Scanner;

public class sc4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter any integer");
            int a = sc.nextInt();
            arr[i] = a;
        }
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
