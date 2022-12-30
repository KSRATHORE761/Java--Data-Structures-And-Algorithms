//https://leetcode.com/problems/rotate-array/

//Given an array, rotate the array to the right by k steps, where k is non-negative.

import java.util.Arrays;

public class RotateArrayUptoKthElement {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);

    }
    static void rotate(int[] nums, int k) {
        k %=nums.length;
        //Reverse complete Array;
        reverse(0,nums.length-1,nums);
        //Reverse the elements upto k from 0th index;
        reverse(0,k-1,nums);
        //Reverse the elements upto n from kth index;
        reverse(k,nums.length-1,nums);
        System.out.println(Arrays.toString(nums));
    }
    static void reverse(int start,int end,int[] nums){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
