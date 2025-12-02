//write a program to remove all spaces from a given string.
import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.nextLine();

        String result = s.replaceAll("\\s+", "");
        System.out.println("Without spaces: " + result);
        in.close();
    }
}
