import java.io.Console;

public class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {-10,-5,1,2,4,15,16,22,50,100};
        int target = 1000;
        int result = SearchUsingBinarySearch(arr,target);
        System.out.println(result);
        
    }
    //return index if element found otherwise retrun -1
    static int SearchUsingBinarySearch(int[] arr, int target){
        if(arr == null || arr.length ==0){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}