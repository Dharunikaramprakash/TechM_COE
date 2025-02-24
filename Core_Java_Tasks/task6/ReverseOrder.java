package pack6;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseOrder {
    public static <T> List<T> reverseList(List<T> list) {
        List<T> reverse = new ArrayList<>(list);
        Collections.reverse(reverse);
        return reverse;
    }
    public static void main(String[] args) {
        List<Integer> integers = List.of(5,10,15,20,25,30,35);
        System.out.println("Original List: " + integers);
        System.out.println("Reversed List: " + reverseList(integers));
    }
}