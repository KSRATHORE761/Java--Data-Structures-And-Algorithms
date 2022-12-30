import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.

// Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows

// a, b are from arr
// a < b
// b - a equals to the minimum absolute difference of any two elements in arr

//https://leetcode.com/problems/minimum-absolute-difference/
public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int[] nums = {3,8,-10,23,19,-4,-14,27};
        

    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr){
        List<List<Integer>> x = new ArrayList<>();  // our final list
	    int diff = Integer.MAX_VALUE;
	    Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            diff = Math.min(diff,Math.abs(arr[i]-arr[i-1])); 
        }
        for(int i=1;i<arr.length;i++){
            if(diff == Math.abs(arr[i]-arr[i-1])){
                x.add( Arrays.asList(arr[i-1], arr[i]) );
            }
        }
        return x;
    }
}
