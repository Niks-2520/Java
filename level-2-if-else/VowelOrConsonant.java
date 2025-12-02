//write a program to check if a given character is a vowel or consonant using if-else statements.
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a single alphabet character: ");
        char ch = in.next().toLowerCase().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                System.out.println(ch + " is a vowel.");
            else
                System.out.println(ch + " is a consonant.");
        } else {
            System.out.println("Please enter a valid alphabet character.");
        }
        in.close();
    }
}
