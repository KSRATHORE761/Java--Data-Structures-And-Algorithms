import java.util.Arrays;

public class FindMissingPositive {
    public static void main(String[] args) {
        int[] arr={1,2,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Missing Positive No is "+ findMissingNo(arr));
    }
    static void sort(int[] arr){
        int i =0;
        int n =arr.length;
        while(i<n){
            int correct = arr[i]-1;
            if(arr[i]>0 && arr[i]<=n && arr[i]!= arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static int findMissingNo(int[] arr){
        for(int j = 0;j<arr.length;j++){
            if(arr[j]!=j+1){
                return j+1;
            }
        }
        return arr.length+1;
    }
}