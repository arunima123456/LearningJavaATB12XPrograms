package Task;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
 Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number ");
        int number=scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        // Handle edge cases
        if (n <= 1) {
            return false; // 0, 1, and negative numbers are not prime
        }

        // Check for divisibility from 2 to n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; // If divisible by any number, it's not prime
            }
        }
        return true; // If no divisors, the number is prime
    }
}