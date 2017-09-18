package Sort;

public class HeapSort {

    public static void KeepHeap(int[] nums, int index, int length) {
        if (index >= (length / 2)) {
            return;
        }
        int leftIndex = (2 * index) + 1;
        int rightIndex = (2 * index) + 2;
        int num = nums[index];
        int maxIndex = index;
        if (leftIndex <= length && num < nums[leftIndex]) {

        }
        if (rightIndex <= length) {

        }


    }


    public static void heapSort() {

    }
}
