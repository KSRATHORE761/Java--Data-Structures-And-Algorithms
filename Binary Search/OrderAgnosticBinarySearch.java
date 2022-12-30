public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {100,90,80,70,50,30,20,10,5,0,-5,-10,-15,-30};
        int target =-5;
        int result = orderAgnosticBinarySearch(arr,target);
        System.out.println(result);
    }
    static int orderAgnosticBinarySearch(int[] arr, int target){
        if(arr== null || arr.length == 0){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
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
