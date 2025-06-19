package single_inheritance;

public class animal
{
    public void sound()
    {
        System.out.println("animal has their own sounds");
    }
    public static class dog extends animal
    {
        public void sound()
        {
            System.out.println("dog barks");
        }
    }

    public static void main(String[] args) {
        animal a=new animal();
        a.sound();
        dog d=new dog();
        d.sound();

    }


}
