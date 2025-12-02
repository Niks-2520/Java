//write a program to perform linear search on an array.
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many elements? ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();

        System.out.print("Enter value to search: ");
        int key = in.nextInt();

        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) { idx = i; break; }
        }

        if (idx == -1) System.out.println(key + " not found.");
        else System.out.println(key + " found at index " + idx + " (0-based).");
        in.close();
    }
}
