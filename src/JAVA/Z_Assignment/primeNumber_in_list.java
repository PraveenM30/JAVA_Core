    package JAVA.Z_Assignment;

    import java.util.*;

    public class primeNumber_in_list {
        public static void main(String[] args) {
            List<Integer> numbers =new ArrayList<>();

            int a[]={3, 4, 7, 10, 13, 17,0,1};
            for(int x:a){
                numbers.add(x);
            }
            for(int n: numbers){
                boolean isPrime = true;

                if(n < 2) isPrime = false;

                for(int i = 2; i <= n/2; i++){
                    if(n % i == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime==true){
                    System.out.println(n + " is prime");
                }else{
                    System.out.println(n + " is Composite");
                }
            }
        }
    }