//write a program to calculate the factorial of a non-negative integer using loops.
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = in.nextInt();
        long fact = 1;

        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers.");
        } else {
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println(n + "! = " + fact);
        }
        in.close();
    }
}
