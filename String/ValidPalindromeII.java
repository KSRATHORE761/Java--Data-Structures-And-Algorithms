/*
 Given a string s, return true if the s can be palindrome after deleting at most one character from it.
 */
//https://leetcode.com/problems/valid-palindrome-ii/
public class ValidPalindromeII {
    public static void main(String[] args) {
        String s ="abca";
        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<right){
           if(s.charAt(left)!=s.charAt(right)){
                return IsPalindrome(s,left+1,right) || IsPalindrome(s,left,right-1);
            }
            left++;
            right--; 
        }
        return true;
    }
    public static boolean IsPalindrome(String s, int i ,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
