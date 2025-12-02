//write a program to convert a given string to uppercase.
import java.util.Scanner;

public class ToLowerCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.nextLine();

        System.out.println("Lowercase: " + s.toLowerCase());
        in.close();
    }
}
