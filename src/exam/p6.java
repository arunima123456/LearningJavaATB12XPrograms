package exam;

import java.util.Scanner;

public class p6
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number ");
        int num=sc.nextInt();
        if(num>0)
        {
            System.out.println("positive");
        }
        else {
            System.out.println("negative");
        }
    }
}
