package pack7;

import java.util.ArrayList;

public class Retrieve {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(java.util.List.of("Red", "Blue", "Green"));
        System.out.println("Element at index 1: " + colors.get(1));
    }
}
