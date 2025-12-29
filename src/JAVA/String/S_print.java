package JAVA.String;

public class S_print {
    public static void main(String[] args) {
        String s="praveen";
        char ch[]=s.toCharArray();
        for (int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
    }
}