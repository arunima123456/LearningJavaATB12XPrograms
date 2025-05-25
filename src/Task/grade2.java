package Task;

import java.util.Scanner;

public class grade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerical score (0-100): ");
        int score;

        // Input validation loop
        while (true) {
            if (scanner.hasNextInt()) {
                score = scanner.nextInt();
                if (score >= 0 && score <= 100) {
                    break; // Valid input, exit loop
                } else {
                    System.out.print("Invalid score. Please enter a score between 0 and 100: ");
                }
            } else {
                System.out.print("Invalid input. Please enter a whole number: ");
                scanner.next(); // Consume the invalid token
            }
        }

        // 2. Calculate the letter grade
        char letterGrade;

        if (score >= 90 && score <= 100) {
            letterGrade = 'A';
        } else if (score >= 80 && score <= 89) {
            letterGrade = 'B';
        } else if (score >= 70 && score <= 79) {
            letterGrade = 'C';
        } else if (score >= 60 && score <= 69) {
            letterGrade = 'D';
        } else if (score >= 0 && score <= 59) { // Can also just be 'else' if input is validated to be >= 0
            letterGrade = 'F';
        } else {
            // This case should ideally not be reached if input validation is thorough,
            // but it's good for robustness.
            letterGrade = 'X'; // Indicate an error or unexpected score
            System.out.println("Error: Score is outside the expected 0-100 range after validation.");
        }

        // 3. Display the letter grade
        if (letterGrade != 'X') { // Only print if a valid grade was assigned
            System.out.println("The numerical score " + score + " corresponds to the letter grade: " + letterGrade);
        }

    }
}
