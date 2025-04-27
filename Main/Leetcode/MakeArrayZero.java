public class MakeArrayZero {

    public int makeArrayZero(int[] nums) {
        int n = nums.length;
        int validSelections = 0;

        // Iterate over all positions where nums[curr] == 0
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                // Simulate both directions: left (-1) and right (+1)
                if (simulate(nums, i, -1) || simulate(nums, i, 1)) {
                    validSelections++;
                }
            }
        }

        return validSelections;
    }

    private boolean simulate(int[] nums, int start, int direction) {
        int n = nums.length;
        int[] numsCopy = nums.clone(); // Work with a fresh copy of the array
        int curr = start;

        // Keep moving as long as we are within bounds
        while (curr >= 0 && curr < n) {
            if (numsCopy[curr] == 0) {
                // Move in the current direction
                curr += direction;
            } else {
                // Decrement the value at the current position
                numsCopy[curr]--;
                // Reverse direction
                direction = -direction;
                // Move in the reversed direction
                curr += direction;
            }

            // Ensure curr stays within bounds after each movement
            if (curr < 0 || curr >= n) {
                return false; // We moved out of bounds, so return false
            }
        }

        // Check if all elements are reduced to zero
        for (int num : numsCopy) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        MakeArrayZero solution = new MakeArrayZero();

        // Test Cases
        int[] nums1 = {1, 0, 2, 0, 3};
        System.out.println(solution.makeArrayZero(nums1)); // Expected: 2

        int[] nums2 = {2, 3, 4, 0, 4, 1, 0};
        System.out.println(solution.makeArrayZero(nums2)); // Expected: 0

        int[] nums3 = {0, 0, 0};
        System.out.println(solution.makeArrayZero(nums3)); // Expected: 3

        int[] nums4 = {0};
        System.out.println(solution.makeArrayZero(nums4)); // Expected: 1

        int[] nums5 = {0, 1, 0, 1, 0};
        System.out.println(solution.makeArrayZero(nums5)); // Expected: 3
    }
}
