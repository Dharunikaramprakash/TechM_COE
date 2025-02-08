import java.util.Scanner;
 class example {
    public static void processInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its reciprocal: ");

        try {
            double num = sc.nextDouble();
            double reciprocal = 1 / num;
            System.out.println("The reciprocal is: " + reciprocal);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            sc.close();
        }
    }
}
public class excepExample {

    public static void main(String[] args) {
        example ex = new example();
        ex.processInput();
    }
}
