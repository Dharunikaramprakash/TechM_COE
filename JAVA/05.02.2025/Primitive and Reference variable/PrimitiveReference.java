package example;

public class PrimitiveReference {


    public static void modifyValues(int num, int[] arr) {
        num = num + 10;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }


    public static void main(String[] args) {
        int number = 5;
        int[] numbersArray = {1, 2, 3};

        System.out.println("Before method call: Number = " + number);
        System.out.print("Before method call: Array = ");
        for (int num : numbersArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        modifyValues(number, numbersArray);

        System.out.println("After method call: Number = " + number);
        System.out.print("After method call: Array = ");
        for (int num : numbersArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
