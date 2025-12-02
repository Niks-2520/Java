//write a program to implement a simple calculator using switch-case statements.
import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = in.nextDouble();
        System.out.print("Enter second number: ");
        double b = in.nextDouble();
        System.out.print("Enter operation (+ - * / %): ");
        char op = in.next().charAt(0);

        switch (op) {
            case '+': System.out.printf("Result = %.2f\n", a + b); break;
            case '-': System.out.printf("Result = %.2f\n", a - b); break;
            case '*': System.out.printf("Result = %.2f\n", a * b); break;
            case '/':
                if (b == 0) System.out.println("Cannot divide by zero.");
                else System.out.printf("Result = %.2f\n", a / b);
                break;
            case '%':
                if (b == 0) System.out.println("Cannot divide by zero.");
                else System.out.printf("Result = %.2f\n", a % b);
                break;
            default:
                System.out.println("Invalid operator.");
        }
        in.close();
    }
}
