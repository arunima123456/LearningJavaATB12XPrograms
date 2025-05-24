package Task;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int fact=1;
        if(num==0)
        {
            System.out.println("factorial is "+fact);
        }
        else
        {
            for (int i=num;i>0;i--)
            {
                fact=fact*i;
            }

            System.out.println("factorial is "+fact);


        }
    }
}
