/*Given a string s, return the number of homogenous substrings of s. Since the answer may be too large, return it modulo 109 + 7.

A string is homogenous if all the characters of the string are the same.

A substring is a contiguous sequence of characters within a string. */

//https://leetcode.com/problems/count-number-of-homogenous-substrings/
public class CountNumberofHomogenousSubstrings {
    public static void main(String[] args){
        String s = "abbcccaa";
        System.out.println("Count Homogenous substrings: "+countHomogenous(s));
    }
    public static int countHomogenous(String s){
        int count=0,res=0,cur=0,mod = (int)1e9+7;
        for(int i=0;i<s.length();i++){
            count = s.charAt(i) == cur ? count+1 : 1;
            cur = s.charAt(i);
            res = (res + count)%mod;
        }
        return res;
    }
}
