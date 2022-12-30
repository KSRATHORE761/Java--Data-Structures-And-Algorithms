import java.util.Arrays;

public class NumbersAreSmallerThantheCurrentNumber {
    public static void main(String[] args) {
        int[] nums ={8,1,2,2,3};
        findNumbersAreSmallerThantheCurrentNumber(nums);
    }
    public static void findNumbersAreSmallerThantheCurrentNumber(int[] nums){
        int[] bucket = new int[102];
        for(int i=0; i<nums.length; i++){
            bucket[nums[i]+1]++;
        }
        for(int i=1;i<bucket.length;i++){
            bucket[i] += bucket[i-1];
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = bucket[nums[i]];
        }
        System.out.println(Arrays.toString(bucket));
        System.out.println(Arrays.toString(nums));
    }
}
