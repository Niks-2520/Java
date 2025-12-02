//write a program to check if a number is a palindrome or not.
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long original = in.nextLong();
        long n = Math.abs(original);

        long rev = 0;
        long temp = n;
        while (temp > 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }

        boolean isPal = (rev == n);
        System.out.println(original + (isPal ? " is a palindrome." : " is NOT a palindrome."));
        in.close();
    }
}
