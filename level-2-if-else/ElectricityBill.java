//write a program to calculate electricity bill based on units consumed using if-else statements.
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = in.nextInt();
        double bill = 0.0;

        if (units <= 100) {
            bill = units * 1.5;
        } else if (units <= 200) {
            bill = 100 * 1.5 + (units - 100) * 2.5;
        } else {
            bill = 100 * 1.5 + 100 * 2.5 + (units - 200) * 4.0;
        }

        // Add fixed charge (example)
        bill += 50;

        System.out.printf("Total bill = %.2f\n", bill);
        in.close();
    }
}
