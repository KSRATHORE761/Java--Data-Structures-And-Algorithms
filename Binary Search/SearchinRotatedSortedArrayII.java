//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class SearchinRotatedSortedArrayII {
    public static void main(String[] args){
        int[] nums = {2,5,6,0,0,1,2};
        int target = 0;
        int peak = PeakInRotatedSortedArrayWithDuplicates(nums);
        int searchInFirstHalf = searchInSortedArray(nums,target,0,peak);
        if(searchInFirstHalf != -1){
            System.out.println(searchInFirstHalf); 
        }
        System.out.println(searchInSortedArray(nums,target,peak+1,nums.length-1));
    }
    static int PeakInRotatedSortedArrayWithDuplicates(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<end)
        {
            int mid = start + (end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            //If elements at middle,start,end are equal skip duplicates.
            if(nums[mid]==nums[start] && nums[mid]==nums[end]){
                //skip the duplicates
                //Note: What if start or end are pivot?
                //Check if start is pivot
                if(nums[start]>nums[start+1]){
                    return start;
                }
                start++;
                //Check if start is pivot
                if(nums[end]>nums[end-1]){
                    return end-1;
                }
                end--;
            }
            // left side is sorted so pivot should be on right
            else if(nums[start] < nums[mid] || (nums[start]== nums[start] && nums[mid]>nums[end])){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return start;
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
