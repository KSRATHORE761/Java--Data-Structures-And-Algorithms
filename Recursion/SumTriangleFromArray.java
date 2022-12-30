public class SumTriangleFromArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println(triangularSum(arr));
    }
    public static int triangularSum(int[] nums) {
        prefixSum(nums,1,nums.length);
        return nums[nums.length-1];
    }
    public static int prefixSum(int[] arr,int i,int n){
        int index=i;
        if(i==n){
            return arr[n-1];
        }
        int nums[] = new int[n];
        for(int k=0;k<n;k++){
            nums[k] = arr[k];
        }
        for(int j = i;j<n;j++){
            nums[j] = (arr[j-1] + arr[j])%10;
        }
       return  prefixSum(nums,index+1,n);
    }
}
