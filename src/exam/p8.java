package exam;

public class p8
{
    public static boolean isLeapYear(int year) {
        // Rule 1 & 2: Divisible by 4 but not by 100
        // OR
        // Rule 3: Divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int year1 = 2024;
        int year2 = 1900;
        int year3 = 2000;
        int year4 = 2023;

        System.out.println(year1 + " is a leap year? " + isLeapYear(year1)); // true
        System.out.println(year2 + " is a leap year? " + isLeapYear(year2)); // false
        System.out.println(year3 + " is a leap year? " + isLeapYear(year3)); // true
        System.out.println(year4 + " is a leap year? " + isLeapYear(year4)); // false
    }
}
