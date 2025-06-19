package multilevel_inheritance;

public class parent
{
    parent(String message){
        System.out.println("Parent: " + message);
    }
}
class Child extends parent{
    Child(String message){
        super("Message for Parent"); //Explicit super call
        System.out.println("Child: " + message);
    }
}
