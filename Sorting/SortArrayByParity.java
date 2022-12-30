import java.util.*;
public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums ={3,5,6,2,7,8,9,10};
        SortingArrayByParity(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void SortingArrayByParity(int[] nums){
        int count_even = 0;
        int count_odd=0;
        //Count Even and odd no of elements in an array;
        for(int n : nums){
            if(n%2==0){
                count_even++; 
            }
            else{
                count_odd++;
            }
        }
        //Two pointers approach to short array by Parity
        int left = 0;
        int right = count_even-1;
        while(left<count_even && right<nums.length){
            if(nums[left]%2!=0 && nums[right]%2==0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right++;
            }
            else if(nums[left]%2!=0 && nums[right]%2!=0){
                right++;
            }
            else if(nums[left]%2==0 && nums[right]%2==0){
                left++;
            }
            else{
                left++;
                right++;
            }
        }
    }
}
