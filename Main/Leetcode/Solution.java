import java.util.*;

public class Solution {
    public List<Integer> splitIntoFibonacci(String S) {
        List<Integer> result = new ArrayList<>();
        backtrack(S, result, 0);
        return result;
    }

    private boolean backtrack(String S, List<Integer> sequence, int index) {
        if (index == S.length()) {
            if (sequence.size() >= 3) {
                System.out.println("✔️ Found valid sequence: " + sequence);
                return true;
            } else {
                return false;
            }
        }

        long num = 0;
        for (int i = index; i < S.length(); i++) {
            // Prevent leading zeros
            if (i > index && S.charAt(index) == '0') {
                System.out.println("❌ Skipping due to leading zero: " + S.substring(index, i + 1));
                break;
            }

            num = num * 10 + (S.charAt(i) - '0');
            System.out.println("num is "+num);
            if (num > Integer.MAX_VALUE) {
                System.out.println("❌ Number too big: " + num);
                break;
            }

            int size = sequence.size();
            if (size >= 2) {
                long expectedSum = (long) sequence.get(size - 1) + sequence.get(size - 2);
                if (num < expectedSum) {
                    System.out.println("continue because "+ num +" is less than < "+expectedSum);
                    continue;
                } else if (num > expectedSum) {
                    System.out.println("❌ Breaking because " + num + " > " + expectedSum);
                    break;
                }
            }

            sequence.add((int) num);
            System.out.println("🔹 Trying sequence: " + sequence);
            if (backtrack(S, sequence, i + 1)) return true;
            sequence.remove(sequence.size() - 1);
            System.out.println("🔙 Backtracking, removed: " + num + ", sequence now: " + sequence);
        }

        return false;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        List<Integer> result = sol.splitIntoFibonacci("1101111");
        System.out.println("Final result: " + result);
    }
}
