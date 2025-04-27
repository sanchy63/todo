package Main.MachineCoding.ToggleString;

import java.util.Arrays;
import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        int[] arr={4,3,2,1};
        reverse(arr);
        System.out.println("after reverse"+Arrays.toString(arr));
    }
    static String togglstring(String str){
        StringBuilder sb=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(Character.isLowerCase(ch)) sb.append(Character.toUpperCase(ch));
            else sb.append(Character.toLowerCase(ch));
        }
        return sb.toString();
    }
    static int countDigit(int number,int digit){
        int count=0;
        while(digit!=0){
            int rem=digit%10;
            if(rem==number) count++;
            digit/=10;
        }
        return count;
    }
    static void reverse(int[] arr){
        
    }
}
