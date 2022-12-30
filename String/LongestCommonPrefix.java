/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "". */

//https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] s ={"flower","flow","flight"};
        System.out.println("Longest commmon prefix: "+findLongestCommonPrefix(s));
    }
    public static String findLongestCommonPrefix(String[] s){
        if(s.length==0 || s==null){
            return "";
        } 
        String previousStr = s[0];
        int  i=1;
        while(i<s.length){
            while(s[i].indexOf(previousStr)!=0){
                int index= s[i].indexOf(previousStr);
                previousStr = previousStr.substring(0,previousStr.length()-1);
            }
            i++;
        }
        return previousStr;
    }
}
