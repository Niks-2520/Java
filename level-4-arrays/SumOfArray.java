//write a program to find the sum of all elements in an array.
import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many elements? ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();

        int sum = 0;
        for (int v : arr) sum += v;

        System.out.println("Sum = " + sum);
        in.close();
    }
}
