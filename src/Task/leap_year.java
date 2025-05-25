package Task;

import java.util.Scanner;

public class leap_year
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter month no between (1-12)");
        int month=scanner.nextInt();
        int days;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                System.out.println("enter the year");
                int year = scanner.nextInt();
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                days = -1;
                System.out.println("invalid month number");
        }
        if(days!=-1)
        {
            System.out.println("number of days in  the month"+ days);


        }



    }
}
