//write a program to calculate BMI using if-else statements.
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = in.nextDouble();
        System.out.print("Enter height in meters (e.g. 1.75): ");
        double height = in.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("BMI = %.2f - ", bmi);

        if (bmi < 18.5) System.out.println("Underweight");
        else if (bmi < 25) System.out.println("Normal");
        else if (bmi < 30) System.out.println("Overweight");
        else System.out.println("Obese");

        in.close();
    }
}
