package Task;

import java.sql.SQLOutput;
import java.util.Scanner;

public class vote
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");
        int age=sc.nextInt();
        if(age>18)
        {
            System.out.println("eligible for vote");
        }
        else {
            System.out.println("not eligible");
        }
    }
}
