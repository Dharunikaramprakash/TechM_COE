package pack4;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int in = sc.nextInt();
            checkNumEven(in);
        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }

    public static void checkNumEven(int num) throws Exception {
        if (num % 2 != 0) {
            throw new Exception("Invalid Input: " + num + " is an odd number.");
        }
        System.out.println(num + " is an even number.");
    }
}
