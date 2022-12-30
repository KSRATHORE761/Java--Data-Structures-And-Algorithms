public class FindElementInMountainArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(search(arr,target));
        
    }
    static int search(int[] arr, int target){
        int peak = findPeakInMountainArray(arr);
        int findElementInAscorderofArray = orderAgnosticBinarySearch(arr, target, 0, peak);
        if(findElementInAscorderofArray!=-1){
            return findElementInAscorderofArray;
        }
        return orderAgnosticBinarySearch(arr, target, peak+1, arr.length-1);
    }

    static int findPeakInMountainArray(int[] mountainArr) {
        int start = 0;
        int end = mountainArr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            
            if(mountainArr[mid]>mountainArr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
        
    }
    static int orderAgnosticBinarySearch(int[] arr, int target,int start,int end){
        if(arr== null || arr.length == 0){
            return -1;
        }
        boolean isAsc =arr[start]<arr[end];
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
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
            else{
                if(target>arr[mid]){
                    end = mid-1;
                }
                else if(target<arr[mid]){
                    start = mid+1;
                }
                else{
                    return mid;
                }
            }
        }
        return -1;
    }
}
