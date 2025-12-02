//write a program to swap two numbers.
public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 10;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
