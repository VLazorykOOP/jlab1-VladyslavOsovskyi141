import java.util.Scanner;

public class Lab1Part1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Variant 1: Real input, Real result ===");
        System.out.print("Enter real a: ");
        double a1 = sc.nextDouble();
        System.out.print("Enter real b: ");
        double b1 = sc.nextDouble();
        double result1 = expression(a1, b1);
        System.out.printf("Result (double) = %.4f%n", result1);

        System.out.println("\n=== Variant 2: Integer input, Real result ===");
        System.out.print("Enter integer a: ");
        int a2 = sc.nextInt();
        System.out.print("Enter integer b: ");
        int b2 = sc.nextInt();
        double result2 = expression(a2, b2);
        System.out.printf("Result (double) = %.4f%n", result2);

        System.out.println("\n=== Variant 3: Real input, Integer result ===");
        System.out.print("Enter real a: ");
        double a3 = sc.nextDouble();
        System.out.print("Enter real b: ");
        double b3 = sc.nextDouble();
        int result3 = (int) expression(a3, b3);
        System.out.println("Result (int) = " + result3);

        sc.close();
    }


    public static double expression(double a, double b) {
        double denominator1 = a * Math.pow(b, 2) - 2 * b;
        double denominator2 = 3 * Math.pow(a, 2) + 2;

        if (denominator1 == 0 || denominator2 == 0) {
            System.out.println("Error: division by zero detected!");
            return 0;
}
        return (1 / denominator1) + (b / denominator2);
    }
}
