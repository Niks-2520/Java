//write a program to find the index of a substring within a given string.
import java.util.Scanner;

public class FindSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String s = in.nextLine();
        System.out.print("Enter substring to find: ");
        String sub = in.nextLine();

        int idx = s.indexOf(sub);
        if (idx == -1) System.out.println("Substring not found.");
        else System.out.println("Substring found at index (0-based): " + idx);

        in.close();
    }
}
