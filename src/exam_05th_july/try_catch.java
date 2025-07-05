package exam_05th_july;

public class try_catch
{
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try
        {
        int c=a/b;
            System.out.println(c);


        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
finally {
            System.out.println("i will be always execute");
        }
    }
}
