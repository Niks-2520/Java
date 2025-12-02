//write a program to count the number of vowels in a given string.
import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.nextLine().toLowerCase();

        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') count++;
        }

        System.out.println("Vowel count = " + count);
        in.close();
    }
}
