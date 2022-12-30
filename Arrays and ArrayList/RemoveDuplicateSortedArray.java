import java.util.Arrays;

public class RemoveDuplicateSortedArray {
    public static void main(String[] args){
        int nums[] = {1,1,2};
        int  k = removeDuplicate(nums);
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, k)));
    }
    static int removeDuplicate(int[] nums){
        int i =0;
        for(int n : nums){
            if(i==0 || n> nums[i-1]){
                nums[i++]=n;
            }
        }
        return i;
    }
}
