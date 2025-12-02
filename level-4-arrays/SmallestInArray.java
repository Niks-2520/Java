//write a program to find the smallest element in an array.
import java.util.Scanner;

public class SmallestInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many elements? ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();

        int min = arr[0];
        for (int i = 1; i < n; i++) if (arr[i] < min) min = arr[i];

        System.out.println("Smallest = " + min);
        in.close();
    }
}
