package pack7;

import java.util.LinkedList;

public class InsertInLinkedList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");

        System.out.println("Original LinkedList: " + list);


        int position = 1;
        String element = "Yellow";

        list.add(position, element);

        System.out.println("Updated LinkedList: " + list);
    }
}

