package JAVA.StaticNonStatic;

public class NonStatic {
     int a=10;
    public static void main(String[] args) {
        NonStatic ns=new NonStatic();
        System.out.println(ns.a);//10
        ns.a=11;
        System.out.println(ns.a);//11
        NonStatic nss=new NonStatic();
        System.out.println( nss.a);//10 (because nss is a new object, so `a` is still 10)
    }
}
