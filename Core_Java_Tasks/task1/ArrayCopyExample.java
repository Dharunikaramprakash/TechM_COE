package pack1;

import java.util.Arrays;

public class ArrayCopyExample {
    public static void main(String[] args) {

        int[] originalArray = { 10, 20, 30, 40, 50, 60, 70 };


        int startIndex = 2;
        int endIndex = 5;


        int[] copiedArray = Arrays.copyOfRange(originalArray, startIndex, endIndex);


        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
    }
}
