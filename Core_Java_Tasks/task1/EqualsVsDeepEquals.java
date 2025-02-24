package pack1;

import java.util.Arrays;

public class EqualsVsDeepEquals {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};


        System.out.println("Using equals(): " + Arrays.equals(array1, array2));


        Object[] nestedArray1 = {array1};
        Object[] nestedArray2 = {array2};
        System.out.println("Using deepEquals(): " + Arrays.deepEquals(nestedArray1, nestedArray2));



    }
}
