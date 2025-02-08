package utility;

import java.util.Scanner;

public class Utility {


    public static int getIntegerLength(int number) {
        return String.valueOf(number).length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();


        int length = Utility.getIntegerLength(number);
        System.out.println("Length of the number " + number + " is: " + length);
    }
}
