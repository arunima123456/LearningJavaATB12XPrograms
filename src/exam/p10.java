package exam;

import java.util.Scanner;

public class p10
{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scn.nextInt();
        System.out.print("Enter second number: ");
        double num2 = scn.nextDouble();

        // Input value of operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scn.next().charAt(0);

        // initializing double variable for result
        double result;
        switch (operator) {


            case '+':
                result=num1+num2;
                System.out.println(result);

            case '-':

            result=num1-num2;
                System.out.println(result);

            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            // Case block for / operator
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            // Default block if no case block is executed
            default:
                System.out.println("Invalid operator");
        }
    }
}
