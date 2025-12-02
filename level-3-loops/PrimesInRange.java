//write a program to find all prime numbers in a given range using loops.
import java.util.Scanner;

public class PrimesInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter lower bound: ");
        int a = in.nextInt();
        System.out.print("Enter upper bound: ");
        int b = in.nextInt();

        if (a > b) {
            int t = a; a = b; b = t;
        }
        System.out.println("Primes between " + a + " and " + b + ":");
        for (int n = Math.max(2, a); n <= b; n++) {
            boolean prime = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) { prime = false; break; }
            }
            if (prime) System.out.print(n + " ");
        }
        System.out.println();
        in.close();
    }
}
