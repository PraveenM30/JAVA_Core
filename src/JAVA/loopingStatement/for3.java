package JAVA.loopingStatement;

public class for3 {
    public static void main(String[] args) {
        //WAPTP 1-20 if it is divisible by 5 then skip that number.

        for (int a=1;a<=20;a++){
            if (a%5==0){
                break;
            }
            System.out.println(a);
        }
    }
}
