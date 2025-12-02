//write a program to print Fibonacci series using loops.
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many Fibonacci terms? ");
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("Enter a positive number.");
        } else {
            int a = 0, b = 1;
            System.out.print("Fibonacci: ");
            for (int i = 1; i <= n; i++) {
                System.out.print(a + (i == n ? "" : " "));
                int next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
        }
        in.close();
    }
}
