package pack9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("bytes","data","streams","api","jdbc","characters","array");
        List<String> ascending = strings.stream().sorted().collect(Collectors.toList());
        List<String> descending = strings.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
        System.out.println("Sorting list of strings in alphabetical order:");
        System.out.println("Ascending Order: " + ascending);
        System.out.println("Descending Order: " + descending);
    }
}