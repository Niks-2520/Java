//write a program to calculate the grade based on marks using if-else statements.
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total marks obtained (out of 100): ");
        double marks = in.nextDouble();
        String grade;

        if (marks >= 90) grade = "A+";
        else if (marks >= 80) grade = "A";
        else if (marks >= 70) grade = "B";
        else if (marks >= 60) grade = "C";
        else if (marks >= 50) grade = "D";
        else grade = "F";

        System.out.println("Grade = " + grade);
        in.close();
    }
}
