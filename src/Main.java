public class Main {
    public static void main(String[] args) {

        int a = 16, b = 18, c = 11, d = 3;

        int count = 0;

        if (a % 2 == 0) {
            count++;
        }

        if (b % 2 == 0) {
            count++;
        }

        if (c % 2 == 0) {
            count++;
        }

        if (d % 2 == 0) {
            count++;
        }

        if (count > 2) {
            System.out.println("YES. There are more than two even numbers in the sequence.");

        } else {
            System.out.println("NO. There are no more than two even numbers in the sequence.");

        }

    }
}