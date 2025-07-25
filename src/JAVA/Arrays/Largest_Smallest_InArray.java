package JAVA.Arrays;

public class Largest_Smallest_InArray {
    public static void main(String[] args) {
        int a[] = {-2, 1, 2, 5, 6, 8, 0, 9, 88, -1};
        int largest = a[0];
        int smallest = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
            if (a[i] < smallest) {
                smallest = a[i];
            }
        }
        System.out.println("smallest number in array is  " + smallest);
        System.out.println("largest number in array is  " + largest);

    }
}
