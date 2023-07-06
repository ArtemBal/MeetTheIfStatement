package brick_through_the_wall;

public class Func {
    public static void main(String[] args) {

        double a = 10, b = 8;
        double x = 9, y = 9, z = 20;

        if ((a > x) & (b > y)) {
            System.out.println("It will pass.");
        } else if ((a > y) & (b > x)) {
            System.out.println("It will pass.");
        } else if ((a > x) & (b > z)) {
            System.out.println("It will pass.");
        } else if ((a > z) & (b > x)) {
            System.out.println("It will pass.");
        } else if ((a > y) & (b > z)) {
            System.out.println("It will pass.");
        } else if ((a > z) & (b > y)) {
            System.out.println("It will pass.");
        } else {
            System.out.println("Will not pass.");
        }
    }
}
