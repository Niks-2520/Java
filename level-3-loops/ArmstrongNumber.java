//write a program to check if a number is an Armstrong number.
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = in.nextInt();

        if (n < 0) {
            System.out.println("Enter a non-negative number.");
        } else {
            int temp = n;
            int sum = 0;
            int digits = String.valueOf(n).length();

            while (temp > 0) {
                int d = temp % 10;
                sum += Math.pow(d, digits);
                temp /= 10;
            }

            if (sum == n) System.out.println(n + " is an Armstrong number.");
            else System.out.println(n + " is NOT an Armstrong number.");
        }
        in.close();
    }
}
