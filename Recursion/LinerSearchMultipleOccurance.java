import java.util.ArrayList;
import java.util.Arrays;

public class LinerSearchMultipleOccurance {
    public static void main(String[] args) {
        int[] arr={1,2,4,9,9,12};
        int target = 9;
        int index=0;
        System.out.println(Arrays.toString((searchMultipleOccuranceOfTarget(arr, target, index,new ArrayList<>())).toArray()));
    }

    //static ArrayList<Integer> arrlst= new ArrayList<>();
    // public static int[] searchMultipleOccuranceOfTarget(int[] arr,int target,int index){
    //     if(index==arr.length-1){
    //         return arrlst.stream().mapToInt(i -> i).toArray();
    //     }
    //     if(arr[index]==target){
    //         arrlst.add(index);
    //     }
    //     return searchMultipleOccuranceOfTarget(arr,target,index+1);
    // }

    // Or 
     public static ArrayList<Integer> searchMultipleOccuranceOfTarget(int[] arr,int target,int index, ArrayList<Integer> lst){
        if(index==arr.length-1){
            return lst;
        }
        if(arr[index]==target){
            lst.add(index);
        }
        return searchMultipleOccuranceOfTarget(arr,target,index+1,lst);
    }

}
