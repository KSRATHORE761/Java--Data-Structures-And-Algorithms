/*Given a binary string s, you can split s into 3 non-empty strings s1, s2, and s3 where s1 + s2 + s3 = s.

Return the number of ways s can be split such that the number of ones is the same in s1, s2, and s3. Since the answer may be too large, return it modulo 109 + 7. */

//https://leetcode.com/problems/number-of-ways-to-split-a-string/

public class NumberofWaystoSplitString {
    public static void main(String[] args) {
        String s= "100100010100110";
        System.out.println(numWays(s));
    }
    static int numWays(String s) {
        int m=1_000_000_007;
        int ones=0, n=s.length();
        for(int i=0;i<n;i++){
            ones +=s.charAt(i) - '0';
        }
        if(ones==0){
            return (int)((n-2L)*(n-1L)/2%m);
        }
        if(ones%3!=0){
            return 0;
        }
        int count=0;
        int onesIneachSplit= ones/3;
        int ways_of_First_cut = 0;
        int ways_of_Second_cut=0;
        for(int i=0;i<n;i++){
            count +=s.charAt(i) - '0';
            if(count == onesIneachSplit){
                ways_of_First_cut++;
            }
            else if(count == 2 * onesIneachSplit){
                ways_of_Second_cut++;
            }
        }
        return (int)(ways_of_First_cut * ways_of_Second_cut)%m;
    }
}
