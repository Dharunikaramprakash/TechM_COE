import java.util.*;

public class CollectionTask {
    public static void main(String[] args) {
        ArrayListThread alt=new ArrayListThread();
        alt.start();
        LinkedListThread llt=new LinkedListThread();
        Thread lltt=new Thread(llt);
        lltt.start();
        VectorThread vt=new VectorThread();
        Thread vtt=new Thread(vt);
        vtt.start();
        StackThread st=new StackThread();
        Thread stt=new Thread(st);
        stt.start();
    }
}
class ArrayListThread extends Thread {
    public void run() {

        List<Integer> list1 = new ArrayList<>();
        //System.out.println("Is list1 empty? "+list1.isEmpty());
        list1.add(35);
        list1.add(23);
        list1.add(67);
        list1.add(82);
        list1.add(56);
        list1.add(49);
        list1.add(49);
        list1.add(49);
        //System.out.println("Is list1 empty? "+list1.isEmpty());
        //  System.out.println("The given list is:"+list1);
        System.out.println("Number of elements in the list: " + list1.size());
        //Adding one element
        list1.add(12);
        System.out.println("After adding one element:");
        System.out.println("The given list is :" + list1);
        System.out.println("The number of elements in the list: " + list1.size());
//Checking for an element
        System.out.println("Is 566 available in the list:" + list1.contains(566));
        System.out.println("The given list before removing elements is :" + list1);


        list1.remove(2);//Removing element by its index
        list1.remove(3);//Removing element by its index
        System.out.println("After removing elements:");
        System.out.println("The given list is :" + list1);
        System.out.println("The number of elements in the list: " + list1.size());

    }
}
class LinkedListThread implements Runnable{
    @Override
    public void run() {

            List<Integer> list1 = new LinkedList<>();
            //System.out.println("Is list1 empty? "+list1.isEmpty());
            list1.add(35);
            list1.add(23);
            list1.add(67);
            list1.add(82);
            list1.add(56);
            list1.add(49);
            list1.add(49);
            list1.add(49);
            //System.out.println("Is list1 empty? "+list1.isEmpty());
            //  System.out.println("The given list is:"+list1);
            System.out.println("Number of elements in the list: "+list1.size());
            //Adding one element
            list1.add(12);
            System.out.println("After adding one element:");
            System.out.println("The given list is :"+list1);
            System.out.println("The number of elements in the list: "+list1.size());
//Checking for an element
            System.out.println("Is 566 available in the list:"+list1.contains(566));
            System.out.println("The given list before removing elements is :"+list1);

            list1.remove(2);//Removing element by its index
            list1.remove(3);//Removing element by its index
            System.out.println("After removing elements:");
            System.out.println("The given list is :"+list1);
            System.out.println("The number of elements in the list: "+list1.size());
    }
}
class VectorThread implements Runnable {
    @Override
    public void run()
        {
            List<Integer> list1 = new Vector<>();
            //System.out.println("Is list1 empty? "+list1.isEmpty());
            list1.add(35);
            list1.add(23);
            list1.add(67);
            list1.add(82);
            list1.add(56);
            list1.add(49);
            list1.add(49);
            list1.add(49);
            //System.out.println("Is list1 empty? "+list1.isEmpty());
            //  System.out.println("The given list is:"+list1);
            System.out.println("Number of elements in the list: " + list1.size());
            //Adding one element
            list1.add(12);
            System.out.println("After adding one element:");
            System.out.println("The given list is :" + list1);
            System.out.println("The number of elements in the list: " + list1.size());
//Checking for an element
            System.out.println("Is 566 available in the list:" + list1.contains(566));
            System.out.println("The given list before removing elements is :" + list1);

            list1.remove(2);//Removing element by its index
            list1.remove(3);//Removing element by its index
            System.out.println("After removing elements:");
            System.out.println("The given list is :" + list1);
            System.out.println("The number of elements in the list: " + list1.size());
        }
    }
class StackThread implements Runnable{
    @Override
    public void run() {

            List<Integer> list1 = new Stack<>();
            //System.out.println("Is list1 empty? "+list1.isEmpty());
            list1.add(35);
            list1.add(23);
            list1.add(67);
            list1.add(82);
            list1.add(56);
            list1.add(49);
            list1.add(49);
            list1.add(49);
            //System.out.println("Is list1 empty? "+list1.isEmpty());
            //  System.out.println("The given list is:"+list1);
            System.out.println("Number of elements in the list: "+list1.size());
            //Adding one element
            list1.add(12);
            System.out.println("After adding one element:");
            System.out.println("The given list is :"+list1);
            System.out.println("The number of elements in the list: "+list1.size());
//Checking for an element
            System.out.println("Is 566 available in the list:"+list1.contains(566));
            System.out.println("The given list before removing elements is :"+list1);

            list1.remove(2);//Removing element by its index
            list1.remove(3);//Removing element by its index
            System.out.println("After removing elements:");
            System.out.println("The given list is :"+list1);
            System.out.println("The number of elements in the list: "+list1.size());
    }
}