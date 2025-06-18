package Oops_constructor;

public class book
{
    String title;
    String author;
    int price;
    public book(String title,String author,int price)
    {
        this.author=author;
        this.price=price;
        this.title=title;
    }
    public void display()
    {
        System.out.println(author);
        System.out.println(price);
        System.out.println(title);
    }
    public static void main(String args[])

    {
        book b1=new book("chokher bali","rabindranath",456);
        b1.display();
    }
}
