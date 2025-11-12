package JAVA.Z_Assignment;

public class Vowel_Consonant {
    public static void main (String[] args) {
        char ch='h';

        if ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
            if (ch>='A' && ch<='Z'){
                if(ch=='A' || ch =='E' || ch=='I' || ch=='O' || ch=='U'){
                    System.out.println(ch +" is a Upper case vowel !");
                }else{
                    System.out.println(ch+" is Upper case consonant !");
                }
            }else if(ch=='a' || ch=='e'|| ch=='i' ||ch=='o' || ch=='u'){
                System.out.println(ch +" is lower case vowel");
            }else{
                System.out.println(ch +" is lower case consonant");
            }
        }else if(ch>='0' && ch<='9'){
            System.out.println(ch+" is number!");
        }else{
            System.out.println(ch+" is not a character or number");
        }
    }
}
