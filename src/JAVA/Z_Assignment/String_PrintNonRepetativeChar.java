package JAVA.Z_Assignment;

import java.util.LinkedHashMap;
import java.util.Map;

public class String_PrintNonRepetativeChar {

        public static void main(String[] args) {
            String str = "JAVA";

            Map<Character, Integer> charCount = new LinkedHashMap<>();

            // Count occurrences
            for (char c : str.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }

            // Find first non-repetitive character
            for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                if (entry.getValue() == 1) {
                    System.out.println("First non-repetitive character: " + entry.getKey());
                }
            }
        }
    }
