package pack4;

public class ThrowException {
    public static void main(String[] args) {
        try {

            divide(10, 0);
        } catch (ArithmeticException e) {

            System.out.println(e);
        }

        System.out.println("Program continues after exception handling.");
    }


    public static void divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        System.out.println("Result: " + (a / b));
    }
}
