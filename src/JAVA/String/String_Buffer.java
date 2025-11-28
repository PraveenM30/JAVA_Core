package JAVA.String;

public class String_Buffer {
        public static void main(String[] args) {
            StringBuffer sb = new StringBuffer("Hello");

            // Append a string
            sb.append(" World");
            System.out.println("After append: " + sb);  // Output: "Hello World"

            // Insert a string at a specified index
            sb.insert(6, "Java ");
            System.out.println("After insertion: " + sb);  // Output: "Hello Java World"

            // Delete characters from index 5 to 9
            sb.delete(5, 10);
            System.out.println("After deletion: " + sb);  // Output: "Hello World"

            // Reverse the string
            sb.reverse();
            System.out.println("After reverse: " + sb);  // Output: "dlroW olleH"
        }
    }

