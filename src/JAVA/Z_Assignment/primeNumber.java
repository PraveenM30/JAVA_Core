    package JAVA.Z_Assignment;

    public class primeNumber {
        public static void main(String[] args) {
            int a=14;
            if (a==0 || a==1){
                System.out.println(a+" this is neither prime nor composite");
            }
            boolean isPrime=true;
            for (int i = 2; i <= a/2; i++) {
                if (a%i==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(a+" is a prime ");
            }else {
                System.out.println(a+" is a composite");
            }
        }
    }