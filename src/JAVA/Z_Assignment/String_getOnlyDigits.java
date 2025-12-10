package JAVA.Z_Assignment;


public class String_getOnlyDigits {
    public static void main(String[] args) {
        String str0="A11 rh45 tl678rs ar5!@#$%^&*()=-+_}.,><? n0t g0ld";


        StringBuilder sb = new StringBuilder();

        for (char c : str0.toCharArray()) {
            if (Character.isDigit(c)) {
                //if (Character.isLetter(c)) {
                //    if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                sb.append(c);
            }
        }
        System.out.println("Digits only : "+sb.toString());

        //or

        String str1="A11 rh45 tl678rs ar5!@#$%^&*()=-+_}.,><? n0t g0ld";
        String digits = str1.replaceAll("\\D", "");
        String lettersOnly = str1.replaceAll("[^a-zA-Z]", "");
        String specialChars = str1.replaceAll("[a-zA-Z0-9\\s]", "");


        System.out.println("Digits only : "+digits);
        System.out.println("Letters only : "+lettersOnly);
        System.out.println("Special Character only : "+specialChars);


    }
}