package task_3;

import java.util.Scanner;

public class day_month_year
{
    public static void main(String[] args) {

        int year=0;
        int month=0;
        int day=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the days to convert");
       // Scanner sc = new Scanner(System.in);
        System.out.print("Enter the days to convert : ");
        int days = sc.nextInt();

        if(days>=365)
        {
            year = days/365;           //Calculate years
            int rem_days = days%365;   //Remaining days after extracting years.

            month = rem_days/30;      //Calculate months
            day = rem_days%30;        //Remaining days after extracting months

            System.out.println(year + " years " +","+ month+ " months "+"," +day+" days ");
        }

        else if(days>=0 && days<365)
        {
            month = days/30;
            int rem_days = days%30;

            day = rem_days%30;

            System.out.println(year + " years " +","+ month+ " months "+"," +day+" days ");
        }
        else
        {
            System.out.println("Days must be a positive number");
        }
        sc.close();
    }
}


//OUTPUT
//Enter the days to convert : 800
//2 years ,2 months ,10 days

//Enter the days to convert : 1000
//2 years ,9 months ,0 days

//Enter the days to convert : 0
//0 years ,0 months ,0 days




