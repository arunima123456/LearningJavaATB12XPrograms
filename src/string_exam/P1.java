package string_exam;

public class P1
{
    public static void main(String[] args) {
        // 1. String Concatenation
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName; // Using '+' operator
        System.out.println("Concatenated String (using +): " + fullName);

        String greeting = "Hello";
        String message = greeting.concat(", World!"); // Using concat() method
        System.out.println("Concatenated String (using concat()): " + message);

        // 2. String Length
        String text = "Java Programming";
        int length = text.length();
        System.out.println("Length of \"" + text + "\": " + length);

        // 3. Substring Extraction
        String originalString = "Programming in Java";
        String subString1 = originalString.substring(0, 11); // "Programming"
        System.out.println("Substring from index 0 to 10: " + subString1);

        String subString2 = originalString.substring(15); // "Java" (from index 15 to end)
        System.out.println("Substring from index 15 to end: " + subString2);

        // 4. Character Extraction
        String word = "Example";
        char firstChar = word.charAt(0); // 'E'
        char lastChar = word.charAt(word.length() - 1); // 'e'
        System.out.println("First character of \"" + word + "\": " + firstChar);
        System.out.println("Last character of \"" + word + "\": " + lastChar);
    }

    }
