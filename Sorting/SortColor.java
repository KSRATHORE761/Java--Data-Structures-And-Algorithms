import java.util.Arrays;

// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

//https://leetcode.com/problems/sort-colors/
public class SortColor {
    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length-1;
         while(mid<=high){
             if(nums[mid]==0){
                 swap(nums, low ,mid);
                 low++;
                 mid++;
             }
             else if(nums[mid]==1){
                 mid++;
             }
             else{
                 swap(nums,mid,high);
                 high--;
             }
         }
     }
     public static void swap(int[] nums, int x , int y){
         int temp = nums[x];
         nums[x] = nums[y];
         nums[y] = temp;
     }
}
