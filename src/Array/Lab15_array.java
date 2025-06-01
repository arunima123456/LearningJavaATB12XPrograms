package Array;

public class Lab15_array
{
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // 3x3
        // R -> 3
        // C -> 3

        // 1,2,3
        // 4,5,6
        // 7,8,9


        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j]);
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
