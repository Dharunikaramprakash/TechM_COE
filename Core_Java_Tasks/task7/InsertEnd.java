package pack7;

import java.util.LinkedList;

public class InsertEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(java.util.List.of("Apple", "Banana"));
        list.offerLast("Peach");
        System.out.println("After inserting at end: " + list);
    }
}
