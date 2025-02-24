package pack6;

import java.util.List;

public class IndexOfTargetElement {
    public static <T> int findFirstIndex(List<T> list, T target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        List<String> strings = List.of("html","java","css","js","java","jsp","servlet");
        System.out.println("Index of 'java' in the given list: " + findFirstIndex(strings, "java"));
        System.out.println("Index of 'css' in the given list: " + findFirstIndex(strings, "css"));
    }
}
