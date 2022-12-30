import java.util.Arrays;
class SquaresofaSortedArray{
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(findSqureofSortedArray(nums)));
    }
    public static int[] findSqureofSortedArray(int[] nums){
        int[] res = new int[nums.length];
        int left = 0, right = nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[right]*nums[right]>nums[left]*nums[left]){
                res[i] =nums[right]*nums[right]; 
                right--;
            }
            else{
                res[i] =nums[left]*nums[left]; 
                left++;
            }
        }
        return res;
    }
}