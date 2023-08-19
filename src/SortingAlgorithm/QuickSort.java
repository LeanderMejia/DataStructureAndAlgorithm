package SortingAlgorithm;
import java.util.Arrays;

public class QuickSort {
    /*
     * QuickSort is a sorting algorithm that works by selecting a pivot element and
     * partitioning the other elements into two sub-arrays, according to whether
     * they are less than or greater than the pivot. The sub-arrays are then sorted
     * recursively.
     */

    public static void main(String[] args) {
        int[] nums = { 8, 2, 1, 5, 4, 7, 3, 6 };

        quickSort(nums, 0, nums.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(nums));
    }

    private static void quickSort(int[] array, int startIndex, int endIndex) {
        // Base case: If the sub-array has only one or zero elements, it's already
        // sorted
        if (endIndex <= startIndex)
            return;

        // Partition the array and get the index of the pivot element
        int pivotIndex = partition(array, startIndex, endIndex);

        // Recursively sort the sub-arrays on both sides of the pivot
        quickSort(array, startIndex, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, endIndex);
    }

    private static int partition(int[] array, int startIndex, int endIndex) {
        // Select the pivot element, which is the last element in the sub-array
        int pivot = array[endIndex];

        // Initialize the index of the smaller element
        int i = startIndex - 1;

        // Iterate through the array and rearrange elements around the pivot
        for (int j = startIndex; j <= endIndex - 1; j++) {
            if (array[j] < pivot) {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        // Swap array[i] and the pivot (last element)
        int temp = array[i];
        array[i] = array[endIndex];
        array[endIndex] = temp;

        // Return the updated index of the pivot element
        return i;
    }
}
