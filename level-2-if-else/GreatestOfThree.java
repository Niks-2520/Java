//write a program to find the greatest of three numbers using if-else statements.
import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int greatest = a;

        if (b > greatest) greatest = b;
        if (c > greatest) greatest = c;

        System.out.println("Greatest = " + greatest);
        in.close();
    }
}
