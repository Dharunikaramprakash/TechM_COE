package pack9;

import java.util.Arrays;
import java.util.List;

public class Average {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(22,33,44,55,66,77);
        double average = integers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Average: " + average);
    }
}
