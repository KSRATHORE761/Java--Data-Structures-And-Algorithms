import java.util.Arrays;
import java.util.Comparator;

// Given a list of non-negative integers nums, arrange 
// them such that they form the largest number and return it.
// Since the result may be very large, so you need to return a string instead of an integer.

//https://leetcode.com/problems/largest-number/
public class LargestNumber {
    public static void main(String[] args){
        int[] nums = {3,30,34,5,9};
        System.out.println("Largest No : " + findlargestNumber(nums));
    }
    public static String findlargestNumber(int[] nums){
        if(nums ==null || nums.length==0){
            return "";
        }
        String[] s_nums = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            s_nums[i] = String.valueOf(nums[i]);
        }
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String str1,String str2){
                String s1 = str1 + str2;
                String s2 = str2 + str1;
                return s2.compareTo(s1);
            }
        };
        Arrays.sort(s_nums,comp);
        if(s_nums[0].charAt(0)=='0'){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for(String s : s_nums){
            sb.append(s);
        }
        return sb.toString();
    }
}
