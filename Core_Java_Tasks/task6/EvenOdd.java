package pack6;

import java.util.List;

public class EvenOdd {
    public static <T extends Number> void sumEvenOdd(List<T> num) {
        int even = 0, odd = 0;
        for (T n : num) {
            if (n.intValue() % 2 == 0) {
                even += n.intValue();
            } else {
                odd += n.intValue();
            }
        }
        System.out.println("Sum of Even Numbers: " + even);
        System.out.println("Sum of Odd Numbers: " + odd);
    }
    public static void main(String[] args) {
        List<Integer> integers = List.of(2,3,4,9,6,15,8,27);
        sumEvenOdd(integers);
    }
}