package SortingAlgorithm;

import java.util.Arrays;

public class InsertionSort {
    /*
     * Insertion Sort is like sorting a deck of playing cards. You start with an
     * unsorted pile and pick a card, then you insert it into the correct position
     * in your sorted hand. You repeat this process until all cards are in the right
     * place. Similarly, Insertion Sort works by taking elements from an unsorted
     * list and placing them in their correct position within a sorted part of the
     * list.
     */

    public static void main(String[] args) {
        int[] nums = { 5, 6, 2, 4, 1, 7, 8, 9, 3 };

        // Start from the second element (index 1), as the first element is considered
        // sorted
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i]; // Store the current element that needs to be inserted
            int j = i - 1; // Index of the element before the current one

            // Move higher value elements to the right to make space for insertion
            while (j >= 0 && nums[j] > temp) {
                nums[j + 1] = nums[j]; // Shift element to the right
                j--; // Move left in the sorted part of the array
            }

            nums[j + 1] = temp; // Insert the stored element into its correct position
        }

        // Print the sorted array
        System.out.println(Arrays.toString(nums));
    }
}
