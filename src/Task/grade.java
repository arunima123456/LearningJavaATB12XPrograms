package Task;

import java.util.Scanner;

public class grade
{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Grade");
        String grade= scanner.next();

        switch (grade){
            case "A"-> System.out.println("Excellent");
            case "B"-> System.out.println("Very Good");
            case "C"-> System.out.println("Good");
            case "D"-> System.out.println("Needs Improvement");
            case "E"-> System.out.println("Fail");
            default -> System.out.println("Invalid Grade");


        }



    }
}
