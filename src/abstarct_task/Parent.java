package abstarct_task;

abstract public class Parent {
    abstract void show();
    void display()
    {
        System.out.println("parent class message");
    }
    static class Child extends Parent
    {
        @Override
        void show()
        {
            System.out.println("child class message");
        }
    }

    public static void main(String[] args) {
        Child c=new Child();
        c.show();
        c.display();

    }
}
