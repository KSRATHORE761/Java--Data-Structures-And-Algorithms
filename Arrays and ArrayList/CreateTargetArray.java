import java.util.ArrayList;
import java.util.Arrays;
public class CreateTargetArray{
    public static void main(String[] args){
        int[] nums = {0,1,2,3,4};
        int index[] = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(index,nums)));
    }
    static int[] createTargetArray(int[] index,int[] nums){
        ArrayList<Integer> a = new ArrayList<Integer>();
        int n = nums.length;
        for(int i =0;i<n;i++){
            a.add(index[i],nums[i]);
        }
        int[] target = new int[n];
        for(int i =0;i<n;i++){
           target[i] = a.get(i);
        }
        return target;
    }
}