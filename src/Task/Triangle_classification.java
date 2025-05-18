package Task;

import java.util.Scanner;

public class Triangle_classification
{
    public static void main(String[] args) {
        System.out.println("Enter length of three sides of Triangle");
        Scanner scanner=new Scanner(System.in);
        System.out.println("a");
        int a=scanner.nextInt();
        System.out.println("b");
        int b=scanner.nextInt();
        System.out.println("c");
        int c=scanner.nextInt();
        if((a==b)&&(b==c))
        {
            System.out.println("This is equilateral triangle");

        }
        else if((a==b)||(b==c))
        {
            System.out.println("This is isosceles triangle");
        }
        else {
            System.out.println("This is scalene triangle");
        }
        }
    }

