import java.util.Arrays;

public class FirstandLastPositionofElementinSortedArray {
    public static void main(String[] args){
        int[] arr = {5,7,7,8,8,8,8,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }
    static int[] searchRange(int[] nums, int target) {
        int[] res= new int[2];
        if(nums == null || nums.length==0){
            res[0]=-1;
            res[1]=-1;
        }
        res[0] = search(nums,target,true);
        res[1] = search(nums,target,false);
        return res;
    }
    static int search(int[] nums, int target,boolean isFirstIndex){
        int ans = -1;
                
        int start = 0;
        int end =nums.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target<nums[mid]){
                end = mid-1;
            }
            else if(target>nums[mid]){
                start = mid+1;
            }
            else{
                ans = mid;
                if(isFirstIndex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
