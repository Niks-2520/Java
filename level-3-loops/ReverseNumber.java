//write a program to reverse an integer using loops.
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = in.nextLong();
        long sign = n < 0 ? -1 : 1;
        n = Math.abs(n);

        long rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }

        System.out.println("Reversed = " + (rev * sign));
        in.close();
    }
}
