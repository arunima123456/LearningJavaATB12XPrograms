package Array;

public class Lab09_array
{
    public static void main(String[] args) {

        int[] numbers = {12, 34, 10};
        int sum = 0; // ->12 + 34 + 10 ->56
        for (int i = 0; i < numbers.length ; i++) {
            sum = sum+numbers[i];
        }


        System.out.println(sum);
    }
}
