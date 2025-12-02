//write a program to check if a person is eligible to vote based on their age using if-else statements.
import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();

        if (age >= 18)
            System.out.println("You are eligible to vote.");
        else
            System.out.println("You are NOT eligible to vote. Wait " + (18 - age) + " more year(s).");

        in.close();
    }
}
