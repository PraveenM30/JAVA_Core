package JAVA.Z_Practice;

public class methodOverloading {

    public static void method(int a){
        System.out.println(a);
    }
    public static void method(char b){
        System.out.println(b);
    }

    public static void main(String[] args){
        method(2);
        method('a');
    }
}
