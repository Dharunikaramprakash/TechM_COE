package pack7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IterateLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(java.util.List.of("Apple", "Banana", "Cherry"));
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}