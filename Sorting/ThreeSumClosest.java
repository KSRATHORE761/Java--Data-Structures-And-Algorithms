import java.util.Arrays;
public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] arr ={-1,2,1,-4};
        int  target = 1;
        System.out.println("3 Sum Closests is : " + findThreeSumClosest(arr,target));
    }
    public static int findThreeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[nums.length-1];
        for(int i =0;i<nums.length;i++){
            int start = i+1,end = nums.length-1;
            while(start<end){
                int sum = nums[i] + nums[start] + nums[end];
                if(Math.abs(sum-target) < Math.abs(res-target)){
                    res = sum;
                }
                if(sum<target){
                    start++;
                }
                else if(sum>target) {
                    end--;
                }
                else{
                    return sum;
                }
            }
        }
        return res;
    }
}
