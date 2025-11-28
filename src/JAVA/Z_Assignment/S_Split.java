package JAVA.Z_Assignment;

public class S_Split {
    public static void main(String[] args) {
        String s="Praveen Mohansundar";
        String s1[]=s.split(" ");
        char ch[]=s1[1].toCharArray();
        System.out.println(s1[0]+" "+ch[0]);
    }
}