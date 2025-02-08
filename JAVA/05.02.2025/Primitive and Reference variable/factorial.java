package example;

import java.util.Scanner;

public class factorial {

    // Method to count trailing zeroes in factorial of a number
    public static int countTrailingZeroes(int n) {
        int count = 0;
        while (n >= 5) {
            n /= 5;
            count += n;
        }
        return count;
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Trailing zeroes in " + number + "! : " + countTrailingZeroes(number));
    }
}
