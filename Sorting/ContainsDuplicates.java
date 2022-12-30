import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println("Contains Duplicate : "+CheckDuplicates(nums));
    }
    public static boolean CheckDuplicates(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int a : nums){
            if(!set.contains(a)){
                set.add(a);
            }
            else{
                return true;
            }
        }
        // for(int b : nums){
        //     if(set.contains(b)){
        //         return true;
        //     }
        // }
        return false;
    }

}
