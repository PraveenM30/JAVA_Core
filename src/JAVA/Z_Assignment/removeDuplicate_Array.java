package JAVA.Z_Assignment;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicate_Array{

    public static void main(String[] args) {
        Integer[] numbers = {2, 3, 2, 4, 5, 1, 6,1,0};  // Input array
        Set<Integer> set = new LinkedHashSet<>();
        for (Integer n : numbers) {
            set.add(n);
        }
        Set<Integer> set1 = new LinkedHashSet<>(Arrays.asList(numbers));
        System.out.println("Using for each logic : " +set);
        System.out.println(" Using Arrays.asList() logic : "+set1);
    }
}