package multilevel_inheritance;

public class method_override
{
    void animal()
    {
        System.out.println("animal has own sounds");
    }
    static class dog extends method_override
{
    void animal()
    {
        System.out.println("dog barks");
    }
}

    public static void main(String[] args) {
        method_override mo=new method_override();
        mo.animal();
        dog d=new dog();
        d.animal();

    }
}
