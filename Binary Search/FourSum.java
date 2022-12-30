import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        int target=-294967296;
        System.out.println(Arrays.toString((fourSum(nums,target)).toArray()));
    }
    static List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> res = new ArrayList();
        if(nums==null && nums.length==0){
            return res;
        }
        int n= nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                long target_2 = (long)target-((long)nums[i] + (long)nums[j]);
                int front = j+1;
                int back = n-1;
                while(front<back){
                    long two_sum=(long)nums[front] + (long)nums[back];
                    if(two_sum<target_2){
                        front++;
                    }
                    else if(two_sum>target_2){
                        back--;
                    }
                    else{
                        List<Integer> quad= new ArrayList();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[front]);
                        quad.add(nums[back]);
                        res.add(quad);
                        
                        //Processing the duplicates for numsber 3
                        while(front<back && nums[front]==quad.get(2)){
                            front++;
                        }
                        //Processing the duplicates for numsber 4
                        while(front<back && nums[back]==quad.get(3)){
                            back--;
                        }
                    }
                }
                //Processing the duplicates for numsber 2
                while(j+1<n && nums[j+1]==nums[j]){
                    j++;
                }
            }
             //Processing the duplicates for numsber 1
                while(i+1<n && nums[i+1]==nums[i]){
                    i++;
                }
        }
        
        return res;
    }
}
