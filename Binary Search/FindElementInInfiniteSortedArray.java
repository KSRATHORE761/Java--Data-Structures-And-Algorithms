//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class FindElementInInfiniteSortedArray {
    public static void main(String[] args){
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130,140, 160, 170};
        int target = 5;
        int result =ans(arr,target);
        if(result==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index " + result);
        }
    }
    static int ans(int[] arr, int target){
        //first find the range
        //first start with the box of 2
        int start = 0;
        int end = 1;
        //condition for target to lie in range
        while(target>arr[end]){
            int newStart = end+1;
            // double the size of box;
            end = end + (end-start+1)*2;
            start = newStart;
        }
        return SearchUsingBinarySearch(arr,target,start,end);
    }
    static int SearchUsingBinarySearch(int[] arr, int target,int start,int end){
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
