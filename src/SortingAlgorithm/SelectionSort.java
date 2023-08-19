package SortingAlgorithm;

import java.util.Arrays;

public class SelectionSort {
    /*
     * Selection Sort is a simple sorting algorithm that repeatedly finds the
     * minimum element from the unsorted part of the array and swaps it with the
     * first element of the unsorted part. This process continues until the entire
     * array is sorted.
     */

    public static void main(String[] args) {
        int[] nums = { 5, 6, 2, 4, 1, 7, 8, 9, 3 };

        // Iterate through the array, selecting the minimum element
        // from the unsorted part and swapping it with the current element
        for (int i = 0; i < nums.length - 1; i++) {
            int min = i; // Assume the current index has the minimum value
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[min] > nums[j]) {
                    min = j; // Update min index if a smaller element is found
                }
            }
            // Swap the minimum element with the current element
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }

        System.out.println(Arrays.toString(nums));
    }
}
