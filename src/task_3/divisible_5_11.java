package task_3;

import java.util.Scanner;

public class divisible_5_11
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        if(num%5==0 && num%11==0)
        {
            System.out.println("number is divisible by both 5 and 11");
        }
        else
        {
            System.out.println("number is not divisible");
        }
    }
}
