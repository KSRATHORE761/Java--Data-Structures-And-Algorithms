//https://leetcode.com/problems/sort-colors/

// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.
import java.util.Arrays;
public class SortColors {
    public static void main(String[] args){
        int[] nums = {2,0,2,1,1,0};
        SortColor(nums);
    }
    static void swap(int x, int y, int[] nums){
        int temp = nums[x];
        nums[x]= nums[y];
        nums[y]=temp;
    }
    static void SortColor(int[] nums){
        int start = 0, mid = 0, end = nums.length-1;
        while(mid<=end){
            if(nums[mid]==0){
                swap(start,mid,nums);
                mid++;
                start++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(mid,end,nums);
                end--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
