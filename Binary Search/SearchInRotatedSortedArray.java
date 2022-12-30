//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
public class SearchInRotatedSortedArray{
    public static void main(String[] args){
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int peak = PeakInSortedArray(nums);
        int searchInFirstHalf = searchInSortedArray(nums,target,0,peak);
        if(searchInFirstHalf != -1){
            System.out.println(searchInFirstHalf); 
        }
        System.out.println(searchInSortedArray(nums,target,peak+1,nums.length-1));
    }
    static int PeakInSortedArray(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[mid]<= nums[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;   
            }
        }
        return -1;
    }
    static int searchInSortedArray(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<nums[mid]){
                end = mid-1;
            }
            else if(target>nums[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}