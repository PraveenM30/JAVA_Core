package JAVA.loopingStatement;

public class while3 {
    public static void main(String[] args) {
        int a=5;
        int evensum=0;
        int oddsum=0;
        while (a>=0){
            if(a%2==0){
                evensum=evensum+a;
            }
            else{
                oddsum=oddsum+a;
            }
            a--;
        }
        System.out.println(evensum);
        System.out.println(oddsum);
    }
}
