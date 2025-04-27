package Main.Math;

import java.util.ArrayList;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int ans= primeChecker(n);
       System.out.println(ans);
    }
    public static int primeChecker(int n){
        if(n<2) return 0;
        ArrayList<Integer> list=new ArrayList<>();
        generatePerm("",String.valueOf(n),list);
        for(int i=0;i<list.size();i++){
            if(!isPrime(list.get(i))){
                return 0;
            }
        }
        return 1;
    }
    public static void generatePerm(String prefix,String remaining,ArrayList<Integer> list){
        if(remaining.isEmpty()){
            list.add(Integer.parseInt(prefix));
            return;
        }   
        for(int i=0;i<remaining.length();i++){
            generatePerm(prefix+remaining.charAt(i), remaining.substring(0, i)+remaining.substring(i+1), list);
        }
    }
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
