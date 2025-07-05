package exam_05th_july;

public class multi_catch
{
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = 10 / 0; // This will cause an ArithmeticException
            System.out.println(numbers[5]); // This would cause an ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds error: " + e.getMessage());
        } catch (Exception e) { // General catch-all block (should be placed last)
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
    }

