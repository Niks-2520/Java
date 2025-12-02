//write a program to count even and odd numbers in an array.
import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many elements? ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();

        int even = 0, odd = 0;
        for (int v : arr) {
            if (v % 2 == 0) even++; else odd++;
        }

        System.out.println("Even count = " + even);
        System.out.println("Odd count = " + odd);
        in.close();
    }
}
