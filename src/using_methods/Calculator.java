package using_methods;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double x, y, sum;

        x = inputNumber();
        y = inputNumber();

        sum = addition(x, y);

        System.out.println(x + " + " + y + " = " + sum);
    }

    private static double inputNumber() {
        double value;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.print("Invalid input. Enter number: ");
        }
        return sc.nextDouble();
    }

    private static double addition (double a, double b) {
        return a + b;
    }
    private static double subtraction (double a, double b) {
        return a - b;
    }
    private static double multiplication (double a, double b) {
        return a * b;
    }
    private static double division (double a, double b) {
        return a / b;
    }
}
