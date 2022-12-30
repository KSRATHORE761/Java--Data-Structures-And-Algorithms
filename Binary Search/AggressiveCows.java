public class AggressiveCows {
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,9};
        int n =5;
        int cow = 3;
        System.out.println("Largest Minimum Distance is "+ largestMinimumDistance(arr,n,cow));
    }
    public static int largestMinimumDistance(int[] arr , int n, int cow){
       // int res = 0;
        int low = 1, high = arr[arr.length-1] - arr[0];
        while(low<high){
            int mid = low + (high-low)/2;
            if(CanPlaceCows(arr,n,cow,mid)){
                //res = Math.max(mid,res);
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }
    static boolean CanPlaceCows(int[] arr, int n, int cow, int dist){
        int cordinate = arr[0], count=1;
        for(int i=1;i<n;i++){
            if(arr[i]-cordinate>=dist){
                count++;
                cordinate = arr[i];
            }
            if(cow == count){
                return true;
            }
        }
        return false;
    }
}
