public class MaximumSubarray {
    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            sum +=nums[i];
            maxsum = Math.max(maxsum,sum);
            if(sum<0){
                sum =0;
            }
        }
        return maxsum;
    }
}
