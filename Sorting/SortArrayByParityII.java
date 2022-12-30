import java.util.Arrays;

// Given an array of integers nums, half of the integers in nums are odd, 
//and the other half are even.
// Sort the array so that whenever nums[i] is odd, i is odd, 
//and whenever nums[i] is even, i is even.
// Return any answer array that satisfies this condition.

//https://leetcode.com/problems/sort-array-by-parity-ii/
public class SortArrayByParityII {
    public static void main(String[] args) {
        int[] nums ={3,5,6,2,7,8,9,10};
        SortArrayByParityII(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void SortArrayByParityII(int[] nums){
        int even=0,odd=1;
        int n =nums.length;
        while(even<n && odd<n){
            if(nums[even]%2==0 && nums[odd]%2!=0){
                even = even+2;
                odd = odd+2;
            }
            else if(nums[even]%2==0 && nums[odd]%2==0){
                even=even+2;
            }
            else if(nums[even]%2!=0 && nums[odd]%2==0){
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd]=temp;
                even = even+2;
                odd = odd+2;
            }
            else{
                odd = odd+2;
            }
        }
    }
}
