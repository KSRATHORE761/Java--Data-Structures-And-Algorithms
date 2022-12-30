/** 
 Given an array nums which consists of non-negative integers and an 
 integer m, you can split the array into m non-empty continuous subarrays.
Write an algorithm to minimize the largest sum among these m subarrays. 
 **/

//https://leetcode.com/problems/split-array-largest-sum/
public class SplitArrayLargestSum{
    public static void main(String[] args){
        int[] nums = {7,2,5,10,8};
        int m =2;
        System.out.println(splitArray(nums,m));
    }
    static int splitArray(int[] nums, int m){
        int start = 0;
        int end = 0;
        for(int i = 0;i<nums.length;i++){
            start = Math.max(start,nums[i]);
            end +=nums[i];
        }
        while(start<end){
            int mid = start +(end-start)/2;

            //calculate no of pieces
            int sum = 0;
            int pieces = 1;
            for(int n : nums){
                if(sum + n > mid){
                    pieces++;
                    sum = n;
                }
                else{
                    sum +=n;
                }
            }
            if(pieces>m){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }

}