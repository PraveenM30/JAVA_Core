package JAVA.String;

public class S_Reverse {
    public static void main(String[] args) {
        String s="Praveen";
        char ch[]=s.toCharArray();
        for (int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}
