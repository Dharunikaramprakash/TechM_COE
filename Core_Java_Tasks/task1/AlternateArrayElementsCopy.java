package pack1;

import java.util.ArrayList;
import java.util.List;

public class AlternateArrayElementsCopy {
    public static void main(String[] args) {

        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        List<Integer> alternateElements = new ArrayList<>();


        for (int i = 0; i < originalArray.length; i+=2) {
            alternateElements.add(originalArray[i]);
        }


        System.out.println("Alternate elements: " + alternateElements);
    }
}
