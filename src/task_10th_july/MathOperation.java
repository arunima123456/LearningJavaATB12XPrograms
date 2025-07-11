package task_10th_july;

public class MathOperation
{
    public void multiply(int a,int b)
    {
        int mul=a*b;
        System.out.println(mul);
    }

    public void multiply(int a,int b,int c)
    {
        int mul=a*b*c;
        System.out.println(mul);
    }

    public static void main(String[] args) {


        MathOperation op = new MathOperation();
        op.multiply(10, 20);
        op.multiply(2, 3, 6);
    }

}
