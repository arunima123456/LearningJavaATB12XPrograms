package task_10th_july;

public class Printer
{
    public void printData(int data)
    {
        System.out.println("print integar" + data);
    }
    public void printData(String data)
    {
        System.out.println("print String"+ " " +data);
    }
    public void printData(Double data)
    {
        System.out.println("print Double" + data);
    }

    public static void main(String[] args) {
        Printer p=new Printer();
        p.printData(10);
        p.printData(30.5);
        p.printData("dona");
    }
}
