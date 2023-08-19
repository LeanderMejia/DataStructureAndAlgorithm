package SearchAlgorithm;

public class InterpolationSearch {
    /*
     * Interpolation Search is a searching algorithm that works well on a sorted
     * array. It estimates the position of the target element based on the value of
     * the elements in the array. It's somewhat like finding a word in a dictionary
     * by guessing where it might be based on the first and last words on the pages.
     */

    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int target = 80;

        int index = interpolationSearch(nums, target);
        System.out.println(index);
    }

    private static int interpolationSearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (target >= nums[low] && target <= nums[high] && low <= high) {
            // Calculate the probable position using interpolation formula
            int probe = low + ((target - nums[low]) * (high - low)) / (nums[high] - nums[low]);

            if (nums[probe] == target)
                return probe; // Element found at the probe index

            if (nums[probe] < target) {
                low = probe + 1; // Adjust the range to the right side
            } else if (nums[probe] > target) {
                high = probe - 1; // Adjust the range to the left side
            }
        }
        return -1; // Element not found
    }
}
