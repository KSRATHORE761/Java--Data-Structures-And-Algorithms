import java.util.HashSet;
import java.util.Set;

// Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).

// More formally check if there exists two indices i and j such that :

// i != j
// 0 <= i, j < arr.length
// arr[i] == 2 * arr[j]

//https://leetcode.com/problems/check-if-n-and-its-double-exist/

public class CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
        int[] arr={10,2,5,3};     
        System.out.println(checkIfExists(arr));   
    }
    public static boolean checkIfExists(int[] arr){
        Set<Integer>  set = new HashSet<>();
        for(int i : arr){
            if(set.contains(2*i) || (i%2==0) && set.contains(i/2)){
                return true;
            }
            set.add(i);
        }
        return false;
    }

}
