//write a program to check if a number is prime or not.
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = in.nextInt();

        if (n <= 1) {
            System.out.println(n + " is not prime.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(n + (isPrime ? " is prime." : " is not prime."));
        }
        in.close();
    }
}
