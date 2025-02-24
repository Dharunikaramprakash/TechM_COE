package pack9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Conversion {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("oops","thread","stream","collection","jdbc");
        List<String> uppercase = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        List<String> lowercase = strings.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("UPPERCASE: " + uppercase);
        System.out.println("lowercase: " + lowercase);
    }
}
