package JAVA.loopingStatement;

public class dowhile1 {
    public static void main(String[] args) {
         /* syntax:
         do{
         statement;
         updation;
         }while(condition)
          */
        //note: In do while even if condition fails, program will execute once.

        //write a program to print 1-5.
         int a=1;
         do{
             System.out.println(a);
             a++;
         }while (a<=5);
    }
}
