package SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    /*
     * Bubble Sort is a simple sorting algorithm that repeatedly steps through the
     * list of elements, compares adjacent elements, and swaps them if they are in
     * the wrong order. This process is repeated for each element until the entire
     * list is sorted.
     */

    public static void main(String[] args) {
        int[] nums = { 7, 6, 2, 4, 1, 8, 3, 5 };

        // Outer loop controls the number of passes
        for (int i = 0; i < nums.length - 1; i++) {
            // Inner loop compares adjacent elements and swaps if needed
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println(Arrays.toString(nums));
    }
}
