package Main.Leetcode;

public class substring {
    public static void main(String[] args) {
        String s="aaabaaa";
        boolean flag=hasSpecialSubstring(s,3);
        System.out.println(flag);
    }

    public static boolean hasSpecialSubstring(String s, int k) {
        int n = s.length();
        for (int i = 0; i <= n - k; i++) {
            boolean isSpecial = true;
            // Check if all k characters are the same
            for (int j = i + 1; j < i + k; j++) {
                if (s.charAt(j) != s.charAt(j - 1)) {
                    isSpecial = false;
                    break;
                }
            }
            if (isSpecial) {
                // Check character before the substring, if it exists
                if (i > 0 && s.charAt(i) != s.charAt(i - 1)) {
                    isSpecial = false;
                }

                // Check character after the substring, if it exists
                if (i + k < n && s.charAt(i + k - 1) != s.charAt(i + k)) {
                    isSpecial = false;
                }
            }

            // If the substring satisfies all conditions, return true
            if (isSpecial) {
                return true;
            }
        }
        return false;
    }

}
