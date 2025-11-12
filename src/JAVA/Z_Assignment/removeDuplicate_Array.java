package JAVA.Z_Assignment;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicate_Array{

    public static Integer[] removeDuplicates(Integer[] array) {
        // Use LinkedHashSet to preserve the order and remove duplicates
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(array));

        // Convert the set back to an array
        return set.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 2, 4, 5, 1, 6};  // Input array
        Integer[] result = removeDuplicates(numbers);   // Remove duplicates

        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
}

