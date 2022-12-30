import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IntersectionofTwoArrays {
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        System.out.println(Arrays.toString(findIntersection(nums1,nums2)));
    }
    public static int[] findIntersection(int[] nums1,int[] nums2){
        HashSet<Integer> set = new HashSet<>();
        List<Integer> lst = new ArrayList<>();
        for(int a : nums1){
            set.add(a);
        }
        for(int b : nums2){
            if(set.contains(b)){
                lst.add(b);
                set.remove(b);
            }
        }
        int[] res = new int[lst.size()];
        for(int i=0;i<lst.size();i++){
            res[i] = lst.get(i);
        }
        return res;
    }
}
