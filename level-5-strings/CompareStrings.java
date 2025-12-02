//write a program to compare two strings for equality, both case-sensitive and case-insensitive.
import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = in.nextLine();
        System.out.print("Enter second string: ");
        String s2 = in.nextLine();

        if (s1.equals(s2)) System.out.println("Strings are equal (case-sensitive).");
        else System.out.println("Strings are NOT equal.");

        if (s1.equalsIgnoreCase(s2)) System.out.println("They are equal (case-insensitive).");

        in.close();
    }
}
