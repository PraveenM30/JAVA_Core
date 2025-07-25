package JAVA.loopingStatement;

public class dowhile2 {
    public static void main(String[] args) {
        //write a program to print sum of even and odd from range 1-20.
        int num = 1;
        int evensum = 0;
        int oddsum = 0;
        do {
            if (num % 2 == 0) {
                evensum = evensum + num;
            } else {
                oddsum = oddsum + num;
            }
            num++;
        } while (num <= 20);
        System.out.println("even sum is "+evensum);
        System.out.println("odd sum id "+oddsum);
    }
}
