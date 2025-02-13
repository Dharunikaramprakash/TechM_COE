import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class TreeMapEg {
    public static void main(String[] args) {
        TreeMap<Integer, String> lhm = new TreeMap<>();
        lhm.put(1, "one");
        lhm.put(2, "two");
        lhm.put(3, "three");
        System.out.println("Initial LinkedHashMap lhm1 are : " + lhm);
        lhm.put(2, "For");
        System.out.println("Updated Map " + lhm);
        lhm.remove(1);
        System.out.println("Mappings after removal are : " + lhm);
        System.out.println("Map traversal:");

        for (Map.Entry<Integer, String> e : lhm.entrySet())
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
    }
}
