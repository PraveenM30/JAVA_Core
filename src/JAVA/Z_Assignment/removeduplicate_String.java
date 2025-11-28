package JAVA.Z_Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeduplicate_String {
    public static String removeDuplicate(String input) {
        Set<Character> charAt = new LinkedHashSet();

        for (char c : input.toCharArray()) {
            charAt.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (Character c : charAt) {
            result.append(c);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s=removeDuplicate("aabbcc");
        System.out.println("After removing duplicates >"+ s);
    }
}