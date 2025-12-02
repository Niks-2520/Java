//write a program to reverse a given string.
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.nextLine();

        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        System.out.println("Reversed = " + rev);
        in.close();
    }
}
