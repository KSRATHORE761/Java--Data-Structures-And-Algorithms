import java.util.HashSet;
import java.util.Set;

public class MakeArithmeticProgressionFromSequence {
    public static void main(String[] args) {
        int[] nums = {3,5,1};
        System.out.println("Can Make Arithmetic Progression From Sequence: " + canMakeArithmeticProgression(nums));
    }
    public static boolean canMakeArithmeticProgression(int[] arr) {
        // if(arr.length==2)
        //     return true;
        // Arrays.sort(arr);
        // int i=0;
        // int j =1;
        // int k =2;
        // while(i<arr.length && j<arr.length && k<arr.length){
        //     if(arr[j]-arr[i] !=arr[k]-arr[j]){
        //         return false;
        //     }
        //     i++;
        //     j++;
        //     k++;
        // }
        // return true;
        
        Set<Integer> seen = new HashSet<>();
        int mi = Integer.MAX_VALUE, mx = Integer.MIN_VALUE, n = arr.length;
        for (int a : arr) {
            mi = Math.min(mi, a);
            mx = Math.max(mx, a);
            seen.add(a);
        }
        int diff = mx - mi;
        if (diff % (n - 1) != 0) {
            return false;
        }
        diff /= n - 1;
        while (--n > 0) {
            if (!seen.contains(mi)) {
                return false;
            }
            mi += diff;
        }
        return true;
    }
}
