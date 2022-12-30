import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class FindAllDuplicatesinanArray{
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
        //Create List to store all duplicate no's
        List<Integer> res= new ArrayList<>();
        //Find the duplicates
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                res.add(nums[i]);
            }
        }
        System.out.println("Duplicate No are : -");
        System.out.println(Arrays.toString(res.toArray()));
    }
    public static void cyclicSort(int[] nums){
        int i =0;
        int n = nums.length;
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
    public static void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}