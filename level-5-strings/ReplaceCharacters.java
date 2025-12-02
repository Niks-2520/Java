//write a program to replace all occurrences of a specified character in a string with another character.
import java.util.Scanner;

public class ReplaceCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.nextLine();
        System.out.print("Enter character to replace: ");
        char oldC = in.next().charAt(0);
        System.out.print("Enter new character: ");
        char newC = in.next().charAt(0);

        String replaced = s.replace(oldC, newC);
        System.out.println("Result: " + replaced);
        in.close();
    }
}
