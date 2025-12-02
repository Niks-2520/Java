//write a program to calculate simple interest given principal, rate and time.
public class SimpleInterest {
    public static void main(String[] args) {
        double p = 1000; // principal
        double r = 5;    // rate
        double t = 2;    // time

        double si = (p * r * t) / 100;

        System.out.println("Simple Interest = " + si);
    }
}
