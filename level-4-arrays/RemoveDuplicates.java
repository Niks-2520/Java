//write a program that removes duplicates from an array of integers.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many elements? ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int v : arr) {
            if (!list.contains(v)) list.add(v);
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) result[i] = list.get(i);

        System.out.println("Without duplicates: " + Arrays.toString(result));
        in.close();
    }
}
