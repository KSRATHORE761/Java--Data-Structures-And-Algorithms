public class PrintMaxNoInArray {
    public static void main(String[] args){
        int[] arr= null;
        System.out.println(max(arr));
    }
    static int max(int[] nums){
        if(nums == null){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int ele = nums[0];
        for(int i = 0; i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                ele = nums[j];
                if(max<ele){
                    max = ele;
                }
            }
        }
        return max;
    } 
}
