package multilevel_inheritance;

public class grand_parent
{
    public void bhk1()
{
    System.out.println("i have 1 bhk");
}
public static class parent extends grand_parent
{
    public void bhk2()
    {
        System.out.println("i have 2bhk");
    }
}
public static class son extends parent
{
    public void bhk3()
    {
        System.out.println("i have 3bhk");
    }
}

    public static void main(String[] args) {
         grand_parent gp=new grand_parent();
         gp.bhk1();
         parent p=new parent();
         p.bhk2();
         son s=new son();
         s.bhk3();
    }
}
