//write a program to check if a given string is a palindrome.
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.nextLine().replaceAll("\\s+", "").toLowerCase();

        String rev = new StringBuilder(s).reverse().toString();
        if (s.equals(rev)) System.out.println("Palindrome");
        else System.out.println("Not a palindrome");

        in.close();
    }
}
