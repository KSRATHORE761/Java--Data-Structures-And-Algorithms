import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={3,0,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Missing No is "+ findMissingNo(arr));
    }
    static void sort(int[] arr){
        int i =0;
        int n =arr.length;
        while(i<n){
            int correct = arr[i];
            if(arr[i]<n && arr[i]!= arr[correct]){
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
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;
    }
}
