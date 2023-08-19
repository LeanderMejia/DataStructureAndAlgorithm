package SortingAlgorithm;
import java.util.Arrays;

public class MergeSort {
    /*
     * MergeSort is a sorting algorithm that follows the divide-and-conquer
     * strategy. It divides the input array into smaller halves, sorts them
     * individually, and then merges the sorted halves back together to produce a
     * fully sorted array.
     */

    public static void main(String[] args) {
        int[] nums = { 8, 2, 1, 5, 4, 7, 3, 6 };

        mergeSort(nums);

        System.out.println(Arrays.toString(nums));
    }

    private static void mergeSort(int[] array) {
        int arraySize = array.length;

        if (arraySize <= 1) return;

        int mid = arraySize / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[arraySize - mid];

        // Splitting the array into left and right halves
        for (int i = 0; i < mid; i++) {
            leftArray[i] = array[i];
        }
        int i = 0;
        for (int j = mid; j < arraySize; j++) {
            rightArray[i] = array[j];
            i++;
        }

        // Recursively sort the left and right halves
        mergeSort(leftArray);
        mergeSort(rightArray);

        // Merge the sorted halves
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int i = 0, l = 0, r = 0;

        // Merging the sorted left and right arrays
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        // Copying remaining elements if any
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
