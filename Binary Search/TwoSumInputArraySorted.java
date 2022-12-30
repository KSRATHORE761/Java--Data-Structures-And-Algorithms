import java.util.Arrays;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSumInputArraySorted {
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    static int[] twoSum(int[] nums, int target) {
        int[] res= new int[2];
        // Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        // for(int i=0;i<=nums.length;i++){
        //     if(map.containsKey(target-nums[i])){
        //         res[1]=i+1;
        //         res[0]=map.get(target-nums[i])+1;
        //         return res;
        //     }
        //     map.put(nums[i],i);
        // }
        // return res;
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int twosum = nums[left] + nums[right];
            if(twosum == target){
                res[0]= left+1;
                res[1] = right+1;
                return res;
            }
            else if(twosum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return res;
    }
}
