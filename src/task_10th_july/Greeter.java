package task_10th_july;

public class Greeter
{
    public void greet()
    {
        System.out.println("hello");
    }
    public void greet(String name)
    {
        System.out.println("hello"+ " " +name);
    }

    public static void main(String[] args) {
        Greeter g=new Greeter();
        g.greet();
        g.greet("dona");
    }
}
