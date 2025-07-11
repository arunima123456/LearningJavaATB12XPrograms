package task_10th_july;

public class Utility
{
    public int max(int a,int b)
    {
       return Math.max(a,b);
    }
public int max(int a,int b,int c)
{
    return Math.max(Math.max(a, b), c);
}
public double max(double a,double b)
{
    return Math.max(a,b);
}

    public static void main(String[] args) {
        Utility u=new Utility();
        System.out.println( u.max(10,20));
        System.out.println( u.max(20.5,40.6));
        System.out.println(u.max(2,6,8));

    }

}
