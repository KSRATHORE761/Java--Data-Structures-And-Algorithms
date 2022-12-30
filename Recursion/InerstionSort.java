import java.util.Arrays;

public class InerstionSort {
    public static void main(String[] args) {
        int arr[] = {9,7,6,15,17,5,10,11};
        insertionSort(arr, 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]<arr[index-1]){
            int j=index;
            while(j>0){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                j--;
                //break;
            }
        }
        insertionSort(arr,index+1);
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
