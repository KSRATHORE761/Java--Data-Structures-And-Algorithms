import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, 
//which results in repetition of one number and loss of another number.
// You are given an integer array nums representing the data status of this set after the error.
// Find the number that occurs twice and the number that is missing and return them in the form of an array.

//https://leetcode.com/problems/set-mismatch/
public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
        //Create List to store all duplicate no's
        List<Integer> res= new ArrayList<>();
        //Find the duplicates
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                res.add(nums[i]);
                res.add(i+1);
                break;
            }
        }
        System.out.println("Set Mismatch is : -");
        System.out.println(Arrays.toString(res.toArray()));
    }
    public static void cyclicSort(int[] nums){
        int i =0;
        int n = nums.length;
        while(i<n){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
    }
    public static void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}