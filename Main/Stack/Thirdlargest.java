package Main.Stack;

import java.util.*;

public class Thirdlargest {
    public static void main(String[] args) {
        int[] arr = { 10, 2, 4, 1, 7, 8, 9 };
        int index = 0;
        boolean[] t = new boolean[arr.length];
        for (int i = 0; i < 3; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < arr.length; j++) {
                if (!t[j] && max < arr[j]) {
                    index = j;
                    max = arr[j];
                }
            }
            t[index] = true;
        }
        System.out.println(arr[index]);
    }
}
