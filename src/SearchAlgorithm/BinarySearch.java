package SearchAlgorithm;

public class BinarySearch {
    /*
     * Binary search is a way to find a specific value in a sorted list or array. It
     * works by repeatedly dividing the search interval in half, comparing the
     * middle element to the target value, and adjusting the interval accordingly
     * until the target value is found or the interval becomes empty.
     */

    public static void main(String[] args) {
        int[] nums = new int[100];
        int target = 3;

        // Filling the array with values from 0 to 100
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }

        // Calling binarySearch function to find the target value
        int index = binarySearch(nums, target);
        System.out.println("The index of element " + target + " is: " + index);
    }

    private static int binarySearch(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;

        // Loop until the search interval is valid
        while (startIndex <= endIndex) {
            // Calculate the middle index of the current interval
            int middle = startIndex + (endIndex - startIndex) / 2;
            int value = nums[middle]; // Get the value at the middle index

            // Compare the value to the target
            if (value < target) {
                startIndex = middle + 1; // Adjust the interval to the right half
            } else if (value > target) {
                endIndex = middle - 1; // Adjust the interval to the left half
            } else {
                return middle; // Return the index where the target value was found
            }
        }

        return -1; // Return -1 if the target value was not found
    }
}
