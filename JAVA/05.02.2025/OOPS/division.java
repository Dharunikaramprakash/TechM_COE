package example;
import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        int divident = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
            return;
        }

        int c = divident;
        int result = 0;

        while (c >= divisor) {
            c -= divisor;
            result++;
        }

        System.out.println("The quotient: " + result);
        System.out.println("The remainder: " + c);

        sc.close();
    }
}
