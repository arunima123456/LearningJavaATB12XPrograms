package string_exam;

public class P2
{
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello"); // Creating a new String object
        String s4 = "hello"; // Different case
        String s5 = "World";

        System.out.println("Demonstrating String Comparisons in Java:\n");

        // 1. Using the == operator (Compares object references)
        System.out.println("== Operator (Reference Comparison):");
        System.out.println("s1 == s2: " + (s1 == s2)); // true (String literal pool)
        System.out.println("s1 == s3: " + (s1 == s3)); // false (Different objects in memory)
        System.out.println("s1 == s4: " + (s1 == s4)); // false (Different content and case)
        System.out.println();

        // 2. Using equals() method (Compares content, case-sensitive)
        System.out.println("equals() Method (Content Comparison, Case-Sensitive):");
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true
        System.out.println("s1.equals(s4): " + s1.equals(s4)); // false
        System.out.println("s1.equals(s5): " + s1.equals(s5)); // false
        System.out.println();

        // 3. Using equalsIgnoreCase() method (Compares content, case-insensitive)
        System.out.println("equalsIgnoreCase() Method (Content Comparison, Case-Insensitive):");
        System.out.println("s1.equalsIgnoreCase(s4): " + s1.equalsIgnoreCase(s4)); // true
        System.out.println("s1.equalsIgnoreCase(s5): " + s1.equalsIgnoreCase(s5)); // false
        System.out.println();

        // 4. Using compareTo() method (Lexicographical comparison)
        System.out.println("compareTo() Method (Lexicographical Comparison):");
        // Returns 0 if strings are equal
        // Returns a negative value if the calling string is lexicographically less than the argument string
        // Returns a positive value if the calling string is lexicographically greater than the argument string
        System.out.println("s1.compareTo(s2): " + s1.compareTo(s2)); // 0
        System.out.println("s1.compareTo(s3): " + s1.compareTo(s3)); // 0
        System.out.println("s1.compareTo(s4): " + s1.compareTo(s4)); // Positive value (H comes after h in ASCII)
        System.out.println("s1.compareTo(s5): " + s1.compareTo(s5)); // Negative value (H comes before W)
        System.out.println();

        // 5. Using compareToIgnoreCase() method (Lexicographical comparison, case-insensitive)
        System.out.println("compareToIgnoreCase() Method (Lexicographical Comparison, Case-Insensitive):");
        System.out.println("s1.compareToIgnoreCase(s4): " + s1.compareToIgnoreCase(s4)); // 0
        System.out.println("s1.compareToIgnoreCase(s5): " + s1.compareToIgnoreCase(s5)); // Negative value

    }
}
