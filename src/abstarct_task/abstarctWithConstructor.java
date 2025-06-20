package abstarct_task;

public class abstarctWithConstructor
{
    public static void main(String[] args) {

        Abstract.concreate obj=new Abstract.concreate();
        obj.showMessage();


    }
}
//abstract class
abstract class Abstract
{
    //constuctor
    Abstract()
    {
        System.out.println("abstrcat class constructor");
    }
    abstract void showMessage();
    static class concreate extends Abstract
    {
        @Override
        void showMessage()
        {
            System.out.println("method from abstarct class");
        }
    }
}
