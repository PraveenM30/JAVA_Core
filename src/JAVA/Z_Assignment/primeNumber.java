    package JAVA.Z_Assignment;

    public class primeNumber {
        public static void main(String[] args) {
            int a=11;
            if (a==0 || a==1){
                System.out.println(a+" this is neither prime nor composite");
            }
            boolean flag=false;
            for (int i = 2; i <= a/2; i++) {
                if (a%2==0){
                    flag=true;
                    break;
                }
            }
            if (flag==false){
                System.out.println(a+" is a prime ");
            }else {
                System.out.println(a+" is a composite");
            }
        }
    }
