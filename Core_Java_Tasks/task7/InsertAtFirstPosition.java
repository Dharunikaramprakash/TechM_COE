package pack7;


    import java.util.ArrayList;
import java.util.List;

    public class InsertAtFirstPosition {
        public static void main(String[] args) {
            // Create an ArrayList and add some elements
            List<String> list = new ArrayList<>();
            list.add("Apple");
            list.add("Banana");
            list.add("Cherry");

            System.out.println("Original List: " + list);

            // Insert an element at the first position (index 0)
            list.add(0, "Mango");

            System.out.println("Updated List: " + list);
        }
    }

