//https://leetcode.com/problems/product-of-array-except-self/

// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the division operation.


//https://leetcode.com/problems/product-of-array-except-self/discuss/65622/Simple-Java-solution-in-O(n)-without-extra-space
import java.util.Arrays;
public class ProductofArrayExceptSelf {
    public static void main(String[] args){
        int[] nums = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    static int[] productExceptSelf(int[] nums) {
        int prefix = 1, suffix=1;
        int n = nums.length;
        int[] res= new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                res[i] = prefix;
            }
            else{
                prefix = prefix * nums[i-1];
                res[i] = prefix;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                res[i] = res[i] * suffix;
            }
            else{
                suffix = suffix * nums[i+1];
                res[i] = res[i] * suffix;
            }
        }
        return res;
    }
}
