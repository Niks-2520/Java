//write a program to calculate the discount on a product based on user input.
import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter original price: ");
        double price = in.nextDouble();
        System.out.print("Enter discount percent (e.g. 15 for 15%): ");
        double percent = in.nextDouble();

        double discount = price * percent / 100.0;
        double finalPrice = price - discount;

        System.out.printf("Discount = %.2f\nFinal price = %.2f\n", discount, finalPrice);
        in.close();
    }
}
