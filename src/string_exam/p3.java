package string_exam;

public class p3
{
    private static final int NUM_OPERATIONS = 100000; // Number of append operations

    public static void main(String[] args) {
        // Test String concatenation
        long startTime = System.nanoTime();
        String resultString = "";
        for (int i = 0; i < NUM_OPERATIONS; i++) {
            resultString += "a"; // String concatenation
        }
        long endTime = System.nanoTime();
        System.out.println("Time taken for String concatenation: " + (endTime - startTime) / 1_000_000 + " ms");

        // Test StringBuilder
        startTime = System.nanoTime();
        StringBuilder resultStringBuilder = new StringBuilder();
        for (int i = 0; i < NUM_OPERATIONS; i++) {
            resultStringBuilder.append("a"); // StringBuilder append
        }
        endTime = System.nanoTime();
        System.out.println("Time taken for StringBuilder: " + (endTime - startTime) / 1_000_000 + " ms");

        // Test StringBuffer
        startTime = System.nanoTime();
        StringBuffer resultStringBuffer = new StringBuffer();
        for (int i = 0; i < NUM_OPERATIONS; i++) {
            resultStringBuffer.append("a"); // StringBuffer append
        }
        endTime = System.nanoTime();
        System.out.println("Time taken for StringBuffer: " + (endTime - startTime) / 1_000_000 + " ms");
    }
    }

