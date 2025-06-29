package june_15_task;

public class arithmetic_exception
{
    public static void main(String[] args) {
        int numerator = 20;
        int denominator = 0;

        try {
            int result = numerator/denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught : cannot divide by zero");
        }
        System.out.println("Program continues after exception handling");

    }
}
