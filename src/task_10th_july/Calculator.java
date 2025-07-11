package task_10th_july;

public class Calculator
{
    public void add(int a,int b)
    {
        int sum=a+b;
        System.out.println(sum);

    }
    public void add(double a,double b)
    {
        double sum=a+b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.add(10,20);
        c.add(10.5,20.5);
    }
}
