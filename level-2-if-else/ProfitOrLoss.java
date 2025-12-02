//write a program to calculate profit or loss based on cost price and selling price using if-else statements.
import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        double cp = in.nextDouble();
        System.out.print("Enter selling price: ");
        double sp = in.nextDouble();

        if (sp > cp) {
            double profit = sp - cp;
            System.out.printf("Profit = %.2f\n", profit);
        } else if (cp > sp) {
            double loss = cp - sp;
            System.out.printf("Loss = %.2f\n", loss);
        } else {
            System.out.println("No profit, no loss.");
        }
        in.close();
    }
}
