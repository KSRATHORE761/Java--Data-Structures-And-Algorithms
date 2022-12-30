/*You are given two strings s and t of the same length and an integer maxCost.

You want to change s to t. Changing the ith character of s to ith character of t costs |s[i] - t[i]| (i.e., the absolute difference between the ASCII values of the characters).

Return the maximum length of a substring of s that can be changed to be the same as the corresponding substring of t with a cost less than or equal to maxCost. If there is no substring from s that can be changed to its corresponding substring from t, return 0. */

//https://leetcode.com/problems/get-equal-substrings-within-budget/
public class GetEqualSubstringsWithinBudget {
    public static void main(String[] args){
        String s= "abcd", t = "bcdf";
        int maxCost = 3;
        System.out.println(equalSubstring(s,t,maxCost));
    }
    public static int equalSubstring(String s, String t, int maxCost){
        int i=0,j;
        int n =s.length();
        for(j=0;j<n;j++){
            maxCost -=Math.abs(s.charAt(j) - t.charAt(j));
            if(maxCost<0){
                maxCost +=Math.abs(s.charAt(i)- t.charAt(i));
                i++;
            }
        }
        return j-i;

    }
}
