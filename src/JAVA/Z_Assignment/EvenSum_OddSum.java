package JAVA.Z_Assignment;

public class EvenSum_OddSum {
        public static void main (String[] args) {
            int evensum=0;
            int oddsum=0;
            for (int i=0;i<=4 ;i++ ) {
                if (i%2==0){
                    evensum=evensum+i;
                }
                else{
                    oddsum=oddsum+i;
                }
            }
            System.out.println("even sum is "+evensum);
            System.out.println("odd sum is "+oddsum);
        }
    }