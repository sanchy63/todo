import java.math.BigInteger;

public class Find_Max_Score_Factor {
    public long maxScore(int[] nums) {
        int n = nums.length;
        long maxResult = 0;

        // Calculate the total GCD and LCM
        long totalGCD = nums[0];
        long totalLCM = nums[0];

        for (int i = 1; i < n; i++) {
            totalGCD = gcd(totalGCD, nums[i]);
            totalLCM = lcm(totalLCM, nums[i]);
        }

        // Initial factor score with all elements
        maxResult = totalGCD * totalLCM;

        // Check factor scores when removing each element
        for (int i = 0; i < n; i++) {
            long hcfAfterRemoval = 0;
            long lcmAfterRemoval = 1;

            for (int j = 0; j < n; j++) {
                if (j == i) continue;  // Skip the element being removed

                // Update GCD
                hcfAfterRemoval = (hcfAfterRemoval == 0) ? nums[j] : gcd(hcfAfterRemoval, nums[j]);
                // Update LCM
                lcmAfterRemoval = lcm(lcmAfterRemoval, nums[j]);
            }

            // Calculate the factor score after the removal
            long factorScore = (hcfAfterRemoval * lcmAfterRemoval); // Ensure long multiplication
            maxResult = Math.max(maxResult, factorScore);
        }

        return maxResult;
    }

    public long lcm(long a, int b) {
        return (a / gcd(a, b)) * b; // Avoid overflow by dividing first
    }

    public long gcd(long a, long b) {
        return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).longValue();
    }

    // Main method to test the solution
    public static void main(String[] args) {
        Find_Max_Score_Factor solution = new Find_Max_Score_Factor();

        System.out.println(solution.maxScore(new int[]{2, 4, 8, 16})); // Expected Output: 64
        System.out.println(solution.maxScore(new int[]{1, 2, 3, 4, 5})); // Expected Output: 60
        System.out.println(solution.maxScore(new int[]{3})); // Expected Output: 9
        System.out.println(solution.maxScore(new int[]{19, 27, 29, 13, 21, 19, 17, 10, 11, 20})); // Check Output
    }
}
