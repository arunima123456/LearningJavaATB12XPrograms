package Task;

import java.util.Scanner;

public class grade_mask
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks");
        int marks= sc.nextInt();
        if(marks>=90 && marks<=100)
        {
            System.out.println("A+");
        }
        else if(marks>=80 && marks<=89)
        {
            System.out.println("A");
        }
        else if(marks>=70 && marks<=79)
        {
            System.out.println("B");
        }
        else if(marks>=60 && marks<=69)
        {
            System.out.println("C");
        }
        else if(marks>=50 && marks<=59)
        {
            System.out.println("D");
        }
        else if(marks>=40 && marks<=49){
            System.out.println("E");
        }
        else {
            System.out.println("fail");
        }
    }
}
