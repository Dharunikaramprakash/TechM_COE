package pack7;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateAtSpecifiedPosition {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(java.util.List.of("Apple", "Banana", "Cherry", "Mango"));
        Iterator<String> it = list.listIterator(2);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
