package JAVA.Methods;

public class StaticMethods {

  static String a="It's static";
  String b="It's Non static";

    public static void main(String args[]){
        System.out.println(a);
        StaticMethods obj=new StaticMethods();
        System.out.println(obj.b);
    }
}