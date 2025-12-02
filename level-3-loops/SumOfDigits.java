// Write a program to count the number of digits in an integer using loops.
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = Math.abs(in.nextLong());
        long sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println("Sum of digits = " + sum);
        in.close();
    }
}
