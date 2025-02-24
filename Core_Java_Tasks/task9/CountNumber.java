package pack9;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("session", "map", "servlet", "cookies", "list", "string", "file", "streams");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting letter: ");
        char letter = sc.next().charAt(0);
        long count = strings.stream().filter(word -> word.toLowerCase().startsWith(String.valueOf(letter).toLowerCase())).count();
        System.out.println("Number of strings starting with '" + letter + "': " + count);
        sc.close();
    }
}
