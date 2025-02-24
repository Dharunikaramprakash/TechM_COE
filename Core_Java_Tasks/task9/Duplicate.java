package pack9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,2,4,6,8,3,6,9,1,4,8,5,6);
        List<Integer> result = input.stream().distinct().collect(Collectors.toList());
        System.out.println("List after removing duplicate elements: " + result);
    }
}
