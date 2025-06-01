package Array;

import java.util.Arrays;

public class Lab010_array
{
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};//100,34
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length - 2]);
        System.out.println(numbers[numbers.length - 3]);
        System.out.println(numbers[numbers.length - 4]);
    }
    }
