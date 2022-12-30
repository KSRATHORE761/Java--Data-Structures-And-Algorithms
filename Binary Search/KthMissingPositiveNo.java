public class KthMissingPositiveNo {
    public static void main(String[] args) {
        int k = 5;
        int num[] ={2,3,4,7,11};
        System.out.println(findKthElement(num,k));
    }
    static int findKthElement(int[] nums,int k){
        int start = 0, end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]-mid<=k){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return start+k;
    }
}
