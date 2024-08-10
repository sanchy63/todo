import java.util.*;
public class PallindromeList {
    public static void main(String[] args) {
        String st="abbacca";
        Set<String> set=new HashSet<>();
        recursion("",st,set);
        System.out.println(set);
    }
    public static void recursion(String p,String up,Set<String> set){
        if(up.isEmpty()){
            if(isPallindrome(p)){
                set.add(p);
            }
        }  
        for(int i=0;i<up.length();i++){
            recursion(p+up.charAt(i), up.substring(0, i) + up.substring(i + 1), set);
        }      
    }
    public static boolean isPallindrome(String st){
        int left=0;
        int right=st.length()-1;
        while (left<right) {
            if(st.charAt(left)!=st.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
