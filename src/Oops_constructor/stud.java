package Oops_constructor;

public class stud
{
    int age;
    String name;
    public stud(int age,String name)
    {
        this.name=name;
        this.age=age;
    }
    public void display()
    {
        System.out.println("name:" +name);
        System.out.println("age:" +age);
    }

   public static void main(String args[])
   {
       stud s1=new stud(19,"arup");
       s1.display();
   }

}
