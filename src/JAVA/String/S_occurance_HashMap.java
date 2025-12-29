package JAVA.String;

import java.util.HashMap;

public class S_occurance_HashMap {
    public static void main(String[] args) {
        String input = "helloWorld";
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
            System.out.println( charCount);
        }
    }