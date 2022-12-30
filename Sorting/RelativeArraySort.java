import java.util.Arrays;
import java.util.TreeMap;

// Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
// Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as 
// in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.

//https://leetcode.com/problems/relative-sort-array/discuss/335056/Java-in-place-solution-using-counting-sort
//https://leetcode.com/problems/relative-sort-array/
public class RelativeArraySort {
    public static void main(String[] args) {
        int[] arr1={2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2={2,1,4,3,9,6};
        RelativeArraySortUsingTreeMap(arr1,arr2);
        System.out.println(Arrays.toString(arr1));
        
    }
    //Use this function if constrainst are given
    //i.e. 
    //1 <= arr1.length, arr2.length <= 1000
    // 0 <= arr1[i], arr2[i] <= 1000
    // All the elements of arr2 are distinct.
    // Each arr2[i] is in arr1.
    public static void RelativeArraySortUsingCountingSort(int[] arr1,int[] arr2){
        int[] bucket = new int[1001];
        for(int n : arr1){
            bucket[n]++;
        }
        int i=0;
        for(int n : arr2){
            while(bucket[n]-->0){
                arr1[i++]=n;
            }
        }
        for(int j =0;j<bucket.length;j++){
            while(bucket[j]-->0){
                arr1[i++] = j;
            }
        }

    }
    public static void RelativeArraySortUsingTreeMap(int[] arr1,int[] arr2){
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int n : arr1){
            map.put(n,map.getOrDefault(n, 0)+1);
        }
        int i =0;
        for(int n: arr2){
            for(int j =0;j<map.get(n);j++){
                arr1[i++] = n;
            }
            map.remove(n);
        }
        for(int n : map.keySet()){
            for(int j = 0; j<map.get(n);j++){
                arr1[i++] = n;
            }
        }
    }
}
