import java.util.Arrays;

public class MergeSortUsingRecursion{
    public static void main(String[] args){
        int[] arr={5,4,3,2,1};
        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    private static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    private static int[] merge(int[] first,int[] second){
        int[] mergedArray = new int[first.length + second.length];
        int i=0;
        int j =0;
        int k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mergedArray[k] = first[i];
                i++;
            }
            else{
                mergedArray[k] = second[j];
                j++;
            }
            k++;
        }

        // Adding all the remaining elements into array
        //1. Adding remaining element of first array.
        while(i<first.length){
            mergedArray[k] = first[i];
            i++;
            k++;
        }
         //1. Adding remaining element of second array.
        while(j<second.length){
            mergedArray[k] = second[j];
            j++;
            k++;
        }
        return mergedArray;
    }

    //In-place sorting:
    private static void mergeSortInPlace(int[] arr,int start,int end){
        if(end-start==1){
            return;
        }
        int mid = (start+end)/2;
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr,mid,end);
        mergeInPlace(arr,start,mid,end);
    }
    private static void mergeInPlace(int[] arr,int s,int m,int e){
        int[] mergedArray = new int[e-s];
        int i=s;
        int j =m;
        int k=0;
        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mergedArray[k] = arr[i];
                i++;
            }
            else{
                mergedArray[k] = arr[j];
                j++;
            }
            k++;
        }

        // Adding all the remaining elements into array
        //1. Adding remaining element of first array.
        while(i<m){
            mergedArray[k] = arr[i];
            i++;
            k++;
        }
         //1. Adding remaining element of second array.
        while(j<e){
            mergedArray[k] = arr[j];
            j++;
            k++;
        }
        for(int l=0;l<mergedArray.length;l++){
            arr[s+l] = mergedArray[l];
        }
    }
}