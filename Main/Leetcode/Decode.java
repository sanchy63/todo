package Main.Leetcode;

import java.util.ArrayList;

public class Decode {
    public static boolean canmove = true;
    static ArrayList<Integer> set = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(decodeString("23[a]2[bc]")); // Example input
    }

    public static String decodeString(String s) {
        int digit = 0;
        int i = 0;

        // Parse the multiplier (digits before '[')
        while (s.charAt(i) != '[') {
            digit = digit * 10 + s.charAt(i) - '0';
            i++;
        }

        System.out.println("digit is " + digit + " index " + i);

        // Extract the substring inside the brackets
        String st = makeString(s.substring(i + 1));

        // Decode the string using the multiplier
        String result = decoded(digit, st);

        // Handle the remaining part of the string after the current encoded part
        if (canmove && i + st.length() + 2 < s.length()) {
            result += decodeString(s.substring(i + st.length() + 2));
        }

        return result;
    }

    public static String makeString(String str) {
        if (str.isEmpty()) return "";

        System.out.println("enter");
        int i = 0;
        StringBuilder sb = new StringBuilder();

        // Build the string inside the brackets
        while (str.charAt(i) != ']') {
            if (Character.isDigit(str.charAt(i))) {
                // Handle nested encoded strings
                String nestedDecoded = decodeString(str.substring(i));
                sb.append(nestedDecoded);

                // Stop processing after the nested string
                int closingBracketIndex = str.indexOf(']', i);
                i = closingBracketIndex;
                break;
            }
            sb.append(str.charAt(i));
            i++;
        }

        set.clear();
        set.add(i + 1); // Store the index after the closing bracket
        return sb.toString();
    }

    public static String decoded(int digit, String str) {
        StringBuilder sb = new StringBuilder();

        // Repeat the string `digit` times
        for (int i = 1; i <= digit; i++) {
            sb.append(str);
        }

        return sb.toString();
    }
}