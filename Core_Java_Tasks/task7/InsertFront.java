package pack7;
import java.util.LinkedList;

public class InsertFront {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(java.util.List.of("Apple", "Banana"));
        list.offerFirst("Kiwi");
        System.out.println("After inserting at front: " + list);
    }
}