package SearchAlgorithm;

public class LinearSearch {
    /*
     * Linear Search is a simple search algorithm that looks for an element in a
     * list (or array) by iterating through each element one by one until the target
     * element is found or the entire list is searched. It's like looking for an
     * item in a list by checking each item individually until you find the one
     * you're looking for.
     */

    public static void main(String[] args) {
        int[] nums = { 5, 6, 2, 4, 1, 7, 8, 1, 5 };
        int target = 8;

        int index = linearSearch(nums, target); // Call the linearSearch function
        System.out.println(index); // Print the index of the target element or -1 if not found
    }

    private static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) // Compare the target with the current element
                return i; // If found, return the index of the current element
        }

        return -1; // If not found, return -1
    }
}
