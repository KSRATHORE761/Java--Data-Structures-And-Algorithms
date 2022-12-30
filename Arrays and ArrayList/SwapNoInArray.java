import java.util.Arrays;

public class SwapNoInArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        swap(arr,0, 3);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
