//write a program to print the multiplication table of a number up to a specified multiple.
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.print("Up to which multiple? ");
        int upto = in.nextInt();

        for (int i = 1; i <= upto; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }
        in.close();
    }
}
