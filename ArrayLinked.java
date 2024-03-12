import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLinked {
    public static void main(String[] args) {
        int[] inputSizes = {10, 1000,};

        for (int size : inputSizes) {
            System.out.println("Input Size: " + size);

            // ArrayList
            long arrayListStartTime = System.nanoTime();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                arrayList.add(i);
            }
            long arrayListEndTime = System.nanoTime();
            System.out.println("ArrayList insertion time: " + (arrayListEndTime - arrayListStartTime) + " nanoseconds");

            // LinkedList
            long linkedListStartTime = System.nanoTime();
            LinkedList<Integer> linkedList = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                linkedList.add(i);
            }
            long linkedListEndTime = System.nanoTime();
            System.out.println("LinkedList insertion time: " + (linkedListEndTime - linkedListStartTime) + " nanoseconds");

            int indexToAccess = size / 2; // Accessing middle element
            long arrayListAccessStartTime = System.nanoTime();
            int arrayListElement = arrayList.get(indexToAccess);
            long arrayListAccessEndTime = System.nanoTime();
            System.out.println("ArrayList access time: " + (arrayListAccessEndTime - arrayListAccessStartTime) + " nanoseconds");

            long linkedListAccessStartTime = System.nanoTime();
            int linkedListElement = linkedList.get(indexToAccess);
            long linkedListAccessEndTime = System.nanoTime();
            System.out.println("LinkedList access time: " + (linkedListAccessEndTime - linkedListAccessStartTime) + " nanoseconds");

            System.out.println();
        }
    }

}
