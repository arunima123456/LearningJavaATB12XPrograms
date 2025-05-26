package Task;

import java.util.Scanner;

public class rev_no
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the no");


        if (!scanner.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer");
            return;
        }
            int rev=0;
            int number=scanner.nextInt();
            while(number!=0)
            {
                int digit=number%10;
                rev=rev*10+digit;
                number=number/10;
            }
            System.out.println("rev no "+ rev);

        }

}
