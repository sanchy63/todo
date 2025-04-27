import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

public class LCM {
    public static void main(String[] args) {
        int a=8;
        int b=9;
        Integer[] arr={1,2,3,4,5};
        Arrays.sort(arr,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1,Integer o2){
                return o2-o1;
            }
        });
        Arrays.fill(arr, 0);
        int ans=(a/(BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue()))*b;
        System.out.println(ans);
    }
}
