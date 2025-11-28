package JAVA.String;

import java.util.LinkedHashSet;
import java.util.Set;

public class String_RemoveDuplicates {

    public static String removeDuplicates(String input) {
        // Use LinkedHashSet to maintain the insertion order of characters
        Set<Character> charSet = new LinkedHashSet<>();

        // Iterate over the string and add characters to the set
        for (char c : input.toCharArray()) {
            charSet.add(c);
        }
        // Build a new string without duplicates
        StringBuilder result = new StringBuilder();
        for (char c : charSet) {
            result.append(c);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String input = "programming";
        String result = removeDuplicates(input);
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);
    }
}
