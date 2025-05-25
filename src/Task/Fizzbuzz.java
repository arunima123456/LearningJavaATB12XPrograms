package Task;

import java.util.Scanner;

public class Fizzbuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number between  (1-100): ");


                int num = scanner.nextInt();



                    if (num % 3 == 0) {
                        System.out.println("Fizz");
                    } else if (num % 5 == 0) {
                        System.out.println("Buzz");

                    } else if (num % 3 == 0 && num % 5 == 0) {
                        System.out.println("FizzBuzz");
                    } else {
                        System.out.println("number is neither fizz nor buzz nor fizzbuzz ");
                    }
                }

}
