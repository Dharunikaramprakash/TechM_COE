package pack6;

import java.util.List;
import java.util.ArrayList;

public class Merge {
    public static <T> List<T> mergeAlternately(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();
        int size1 = list1.size(), size2 = list2.size();
        int i = 0, j = 0;
        while (i < size1 || j < size2) {
            if (i < size1) mergedList.add(list1.get(i++));
            if (j < size2) mergedList.add(list2.get(j++));
        }
        return mergedList;
    }
    public static void main(String[] args) {
        List<String> stringList1 = List.of("api","collection","error","generics");
        List<String> stringList2 = List.of("bytes","data","file","hash");
        System.out.println("Merged List: " + mergeAlternately(stringList1, stringList2));
    }
}

