

public class BinarySearchWithRecursion {
    public static void main(String[] args){
        int[] arr = {-1,0,3,5,9,12};
        int target = 2;
        System.out.println(BinarySearch(arr,0,arr.length-1,target));
    }
    static int BinarySearch(int[] arr,int start,int end,int target){
        if(start>end){
            return -1;
        }
        int  mid = start +(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            return BinarySearch(arr,start,mid-1,target);
        }
        else{
            return BinarySearch(arr,mid+1,end,target);
        }
    }
}
