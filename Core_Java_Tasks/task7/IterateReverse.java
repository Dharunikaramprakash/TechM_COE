package pack7;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateReverse {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(java.util.List.of("Apple", "Banana", "Cherry"));
        Iterator<String> it = list.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
