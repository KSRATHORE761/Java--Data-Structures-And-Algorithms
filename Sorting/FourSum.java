import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        int[][] arr = fourSum(nums,target).stream()
        .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
        .toArray(int[][]::new);

        System.out.println(Arrays.deepToString(arr));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) { 
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long target_2 = (long)target-((long)nums[i] + (long)nums[j]);
                int start = j+1, end = nums.length-1;
                while(start<end){
                    long sum = (long)nums[start] + (long)nums[end];
                    if(sum<target_2){
                        start++;
                    }
                    else if(sum>target_2){
                        end--;
                    }
                    else{
                        List<Integer> quad= new ArrayList();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[start]);
                        quad.add(nums[end]);
                        res.add(quad);
                        while(start<end && nums[start] == quad.get(2)){
                            start++;
                        }
                        while(start<end && nums[end]==quad.get(3)){
                            end--;
                        }
                    }
                }
                while(j+1<nums.length && nums[j]==nums[j+1]){
                    j++;
                }
            }
            while(i+1<nums.length && nums[i]==nums[i+1]){
                i++;
            }
        }
        return res;
    }
}
