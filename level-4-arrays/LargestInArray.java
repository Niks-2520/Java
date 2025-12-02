//write a program to find the largest element in an array.
import java.util.Scanner;

public class LargestInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many elements? ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();

        int max = arr[0];
        for (int i = 1; i < n; i++) if (arr[i] > max) max = arr[i];

        System.out.println("Largest = " + max);
        in.close();
    }
}
