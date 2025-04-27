package Main.Dp;

import java.util.Arrays;

public class Ninja_training {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 5},
            {3, 1, 1},
            {3, 3, 3}
        };
        System.out.println(maximumPoints(arr));
    }
    public static int maximumPoints(int[][] arr){
        int n=arr.length;
        Integer[][] dp=new Integer[n][4];
        return solve(dp,arr,3,n-1);
    }
     public static int solve(Integer[][] dp,int[][] points,int last,int day){
        if(day==0){
            int maxi=0;
            for(int task=0;task<3;task++){
                if(task!=last){
                    maxi=Math.max(maxi,points[0][task]);
                }
            }
            return maxi;
        }
         System.out.println(Arrays.deepToString(dp).replace("null", " - "));
        if(dp[day][last]!=null) return dp[day][last];
        int maxi=0;
        for(int task=0;task<3;task++){
            if(task!=last){
                int point=points[day][task]+solve(dp,points,task,day-1);
                maxi=Math.max(point,maxi);
            }
        }
        return dp[day][last]=maxi;
    }
}