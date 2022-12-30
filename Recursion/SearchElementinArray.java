//Searching Element in array using recursion.
public class SearchElementinArray {
    public static void main(String[] args) {
        int[] arr={1,2,4,6,9,12};
        int target = 9;
        int index=0;
        System.out.println(linearSearch(arr, target, index));
    }
    public static boolean linearSearch(int[] arr,int target,int index){
        if(index==arr.length-1){
            return false;
        }
        return arr[index]==target || linearSearch(arr, target, index+1);
    }
}
