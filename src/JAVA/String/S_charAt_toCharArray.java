package JAVA.String;

public class S_charAt_toCharArray {
    public static void main(String[] args) {
        String s="Praveen";

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(6));
        //System.out.println(s.charAt(9));
        //System.out.println(s.charAt(s.length()));//String index out of bound Exception
        System.out.println(s.charAt(s.length()-3));

        char ch[]=s.toCharArray();
        for (int i=0; i<ch.length;i++){
            System.out.print(ch[i]);
        }
    }
}
