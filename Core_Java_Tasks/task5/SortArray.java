package pack5;



import java.util.Arrays;

class SortThread extends Thread {
    private int[] array;
    public SortThread(int[] array) {
        this.array = array;
    }
    public void run() {
        Arrays.sort(array);
    }
    public int[] getSortedArray() {
        return array;
    }
}

class MergeArray {
    public static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }
        while (i < left.length) merged[k++] = left[i++];
        while (j < right.length) merged[k++] = right[j++];
        return merged;
    }
}

public class SortArray {
    public static void main(String[] args) throws Exception{
        int[] array = {7,89,4,10,2,65,1,37,5};
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        SortThread leftSorter = new SortThread(left);
        SortThread rightSorter = new SortThread(right);
        leftSorter.start();
        leftSorter.join();
        rightSorter.start();
        rightSorter.join();
        int[] sortedArray = MergeArray.merge(leftSorter.getSortedArray(), rightSorter.getSortedArray());
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }
}