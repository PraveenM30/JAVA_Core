package JAVA.Z_Assignment;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class S_occurance_HashMap {
    public static void main(String[] args) {
        String input = "helloWorld";
        HashMap<Character, Integer> charCount = new LinkedHashMap<>();

        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
            System.out.println( charCount);
        }
    }