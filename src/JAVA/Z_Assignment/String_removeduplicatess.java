package JAVA.Z_Assignment;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class String_removeduplicatess {
    public static void main(String[] args) {
        String input="Programming";
        Set<Character> charAt = new LinkedHashSet<>();

        for (char c : input.toCharArray()) {
            charAt.add(c);
        }
        StringBuilder result = new StringBuilder();
        for (Character c : charAt) {
            result.append(c);
        }
        System.out.println(charAt);
    }
}