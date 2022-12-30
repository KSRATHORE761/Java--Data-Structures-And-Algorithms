public class CeilingofNumber {
    public static void main(String[] args){
        int[] arr = {1,3,5,6};
        System.out.println(ceilingNumber(arr,2));
    }
    static int ceilingNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end= mid-1;
            }
            else if(target>arr[mid]){
                start=start+1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
