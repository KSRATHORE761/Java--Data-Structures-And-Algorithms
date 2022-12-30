import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        int[][] arr = findthreeSum(nums).stream()
        .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
        .toArray(int[][]::new);

        System.out.println(Arrays.deepToString(arr));

    }
    public static List<List<Integer>> findthreeSum(int[] num){
        Arrays.sort(num);
        List<List<Integer>> res = new ArrayList<>(); 
        for (int i = 0; i < num.length-2; i++) {
        if (i == 0 || (i > 0 && num[i] != num[i-1])) {
            int lo = i+1, hi = num.length-1, sum = 0 - num[i];
            while (lo < hi) {
                if (num[lo] + num[hi] == sum) {
                    res.add(Arrays.asList(num[i], num[lo], num[hi]));
                    while (lo < hi && num[lo] == num[lo+1]) lo++;
                    while (lo < hi && num[hi] == num[hi-1]) hi--;
                    lo++; hi--;
                } else if (num[lo] + num[hi] < sum) lo++;
                else hi--;
           }
        }
    }
    return res;
    }
}
