package exam;

public class p15
{
    public static void main(String[] args) {
            // Input number
            int n = 11;

            // Holds the count of values
            int count = 0;

            // There is no prime number less than 2.
            if (n <= 1) {
                System.out.println("The number is not prime");
                return;
            }

            // Do a for loop
            for (int j = 1; j <= n / 2; j++) {
                if (n % j == 0) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("The number is not prime");
            }
            else {
                System.out.println("The number is prime");
            }

    }
}
