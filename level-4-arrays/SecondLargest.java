//write a program to find the second largest element in an array of integers.
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many elements (>=2)? ");
        int n = in.nextInt();
        if (n < 2) {
            System.out.println("Need at least 2 elements.");
            in.close();
            return;
        }

        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int v : arr) {
            if (v > largest) {
                second = largest;
                largest = v;
            } else if (v > second && v != largest) {
                second = v;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No distinct second largest (all equal?).");
        } else {
            System.out.println("Second largest = " + second);
        }
        in.close();
    }
}
