package JAVA.Z_Assignment;

public class ReverseString {
    public static void main(String[] args) {
        String s="praveen";
        char ch[]=s.toCharArray();
        for (int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}