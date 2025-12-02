// Write a program to determine if a given year is a leap year using if-else statements.
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = in.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is NOT a leap year.");

        in.close();
    }
}
