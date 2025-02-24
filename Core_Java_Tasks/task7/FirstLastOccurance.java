package pack7;

import java.util.LinkedList;

public class FirstLastOccurance {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Banana");
        list.add("Orange");
        list.add("Banana");

        System.out.println("LinkedList: " + list);


        String targetElement = "Banana";


        int firstIndex = list.indexOf(targetElement);


        int lastIndex = list.lastIndexOf(targetElement);


        if (firstIndex != -1) {
            System.out.println("First occurrence of '" + targetElement + "' is at index: " + firstIndex);
            System.out.println("Last occurrence of '" + targetElement + "' is at index: " + lastIndex);
        } else {
            System.out.println("'" + targetElement + "' not found in the LinkedList.");
        }
    }
}
