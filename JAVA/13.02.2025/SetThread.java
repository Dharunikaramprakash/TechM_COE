import java.util.*;
import java.io.*;
import java.lang.Float;

public class SetThread {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        setSample(hs);
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        setSample(lhs);
        TreeSet<Float> ts = new TreeSet<>();
        setSample(ts);


    }

    public static void setSample(HashSet<Integer> hs) {


        hs.add(22);
        hs.add(49);
        hs.add(7);
        hs.add(89);
        hs.add(90);
        hs.add(68);
        hs.add(34);
        hs.add(14);
        System.out.println("HashSet Size: " + hs.size());
        System.out.println("Elements in HashSet: " + hs);
        System.out.print("Using iterator : ");
        Iterator<Integer> iterator = hs.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
        System.out.print("Using enhanced for loop : ");
        for (Integer element : hs)
            System.out.print(element + " ");
        hs.remove(90);
        System.out.println("\nHashSet after removing element : " + hs);
        System.out.println("Elements divisible by 7: ");
        for (Integer ar : hs) {
            if (ar % 7 == 0) {
                System.out.println(ar + " ");
            }

        }

    }

    public static void setSample(LinkedHashSet<String> lhs) {


        lhs.add("AB");
        lhs.add("ABC");
        lhs.add("ABCD");
        lhs.add("ABCDE");
        lhs.add("ABCDEF");
        lhs.add("ABCDEFG");
        lhs.add("ABCDEFGH");
        lhs.add("ABCDEFGHI");
        System.out.println("HashSet Size: " + lhs.size());
        System.out.println("Elements in HashSet: " + lhs);
        System.out.print("Using iterator : ");
        Iterator<String> iterator = lhs.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
        System.out.print("Using enhanced for loop : ");
        for (String element : lhs)
            System.out.print(element + " ");
        lhs.remove("ABC");
        System.out.println("\nHashSet after removing element : " + lhs);
        System.out.println("elements that are with size above 5: ");
        for (String lh : lhs) {
            if (lh.length() > 5) {
                System.out.println(lh + " ");
            }
        }

    }

    public static void setSample(TreeSet<Float> ts) {


        ts.add(43.5f);
        ts.add(67.7f);
        ts.add(25.3f);
        ts.add(56.9f);
        ts.add(34.8f);
        ts.add(23.8f);
        ts.add(36.7f);
        ts.add(12.0f);
        System.out.println("HashSet Size: " + ts.size());
        System.out.println("Elements in HashSet: " + ts);
        System.out.print("Using iterator : ");
        Iterator<Float> iterator = ts.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
        System.out.print("Using enhanced for loop : ");
        for (Float element : ts)
            System.out.print(element + " ");
        ts.remove(36.6f);
        System.out.println("\nHashSet after removing element : " + ts);
        for(Float tts:ts){
            if(tts.floatValue()>20.00f){
                System.out.println(tts+" ");
            }
        }
    }
}
