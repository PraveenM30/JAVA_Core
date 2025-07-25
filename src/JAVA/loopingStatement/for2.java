package JAVA.loopingStatement;

public class for2 {
    public static void main(String[] args) {
        //WAPTF sum of enev and odd from 1-20 using for loop.
        //  int a=1;
        int evensum = 0;
        int oddsum = 0;
        for (int a = 1; a <= 20; a++) {
            if (a % 2 == 0) {
                evensum = evensum + a;
            } else {
                oddsum = oddsum + a;
            }
        }
        System.out.println("even sum is " + evensum);
        System.out.println("odd sum is " + oddsum);
    }
}
