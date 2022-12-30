public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int arr[] = {20,21,45,89,89,90};
        System.out.println(isSorted(arr,0));
    }
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        return arr[i]<=arr[i+1] && isSorted(arr, i+1);
    }
}
