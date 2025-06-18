package Oops_constructor;

import java.sql.SQLOutput;

public class mobile
{
    int price;
    String brand;
    public mobile(String brand)
    {
        this.brand=brand;
    }
    public mobile(String brand,int price)
    {
        this.brand=brand;
        this.price=price;
    }
    public void display()
    {
        System.out.println(brand);
        System.out.println(price);
    }
    public static void main(String args[]) {
        mobile m1=new mobile("nokia");
        m1.display();
        mobile m2=new mobile("samsung",34567);
        m2.display();

}
}
