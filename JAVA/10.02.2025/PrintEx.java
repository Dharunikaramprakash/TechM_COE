package printex;

public class PrintEx {  // Class names should follow PascalCase
    public static void main(String[] args) {

        int integerValue = 102;  // Clear and descriptive variable name
        float floatValue = 10.45F;
        int zeroValue = 0;  // Name should reflect its purpose

        System.out.print("Integer value: " + integerValue);
        System.out.print("Float value:\n" + floatValue);

        System.out.println("Addition of integerValue and floatValue: " + (integerValue + floatValue));
        System.out.println("Multiplication of two: " + (integerValue * floatValue));

        System.err.println("zeroValue cannot be multiplied, which leads to an arithmetic error.");
        System.err.println("Division with zeroValue is not possible as it leads to an arithmetic error.");
    }
}
