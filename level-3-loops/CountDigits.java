//write a program to count the number of digits in an integer.
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = Math.abs(in.nextLong());
        int count = 0;

        if (n == 0) count = 1;
        while (n > 0) {
            count++;
            n /= 10;
        }

        System.out.println("Number of digits = " + count);
        in.close();
    }
}
