import java.util.Arrays;

public class FindDuplicateNo {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
        //find the duplicate Number
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != i+1){
                System.out.println("Duplicate No is "+ nums[i]);
                break;
            }
        }
    }   
    public static void cyclicSort(int[] nums){
        int i=0, n =nums.length;
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
    public static void swap(int[] nums,int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
