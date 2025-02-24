package pack7;

import java.util.LinkedList;
import java.util.List;

public class InsertMultipleElementsInLinkedList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");

        System.out.println("Original LinkedList: " + list);


        LinkedList<String> newElements = new LinkedList<>();
        newElements.add("Yellow");
        newElements.add("Purple");


        int position = 1;


        list.addAll(position, newElements);

        System.out.println("Updated LinkedList: " + list);
    }
}
