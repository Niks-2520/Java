//write a program to count the frequency of each character in a given string.
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.nextLine();

        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> e : freq.entrySet()) {
            System.out.println("'" + e.getKey() + "' : " + e.getValue());
        }
        in.close();
    }
}
