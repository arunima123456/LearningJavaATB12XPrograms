package Task;

public class increment

{
    public static void main(String[] args) {
       // int i = 11;

       // i = i++ + ++i;

       // System.out.println(i);//24
        int i = 1, j = 2, k = 3;

        int m = i-- - j-- - k--;

        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);
    }
}
