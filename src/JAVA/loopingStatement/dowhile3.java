package JAVA.loopingStatement;

public class dowhile3 {
    public static void main(String[] args) {
        //WAPTF sum of multiple of 3 with in 1-20.
        int a = 1;
        int odd = 0;
        do {
            if (a % 3 == 0) {
                odd = odd + a;
            }
            a++;
        } while (a <= 20);
        System.out.println("multiple of 3 is " + odd);
    }
}
