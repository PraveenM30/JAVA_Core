package JAVA.StaticNonStatic;

public class Static {
    static int a=10;
    public static void main(String[] args) {
        //System.out.println(Static.a);
        //System.out.println(a);

        Static s=new Static();
        System.out.println( s.a);
        s.a=11;
        System.out.println(Static.a);
        Static ss=new Static();
        System.out.println( ss.a);
    }
}
