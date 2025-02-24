package pack9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(4,78,7,15,23,5,84,17);
        Optional<Integer> max = integers.stream().max(Integer::compareTo);
        Optional<Integer> min = integers.stream().min(Integer::compareTo);
        System.out.println("Maximum Value: " + max.orElseThrow());
        System.out.println("Minimum Value: " + min.orElseThrow());
    }
}