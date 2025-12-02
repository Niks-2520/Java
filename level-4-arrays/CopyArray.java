//write a program to copy an array to another array.
import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many elements? ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();

        int[] copy = new int[n];
        for (int i = 0; i < n; i++) copy[i] = arr[i];

        System.out.println("Original: " + Arrays.toString(arr));
        System.out.println("Copy    : " + Arrays.toString(copy));
        in.close();
    }
}
