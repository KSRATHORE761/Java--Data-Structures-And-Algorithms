/*You are given a 0-indexed binary string s and two integers minJump and maxJump. In the beginning, you are standing at index 0, which is equal to '0'. You can move from index i to index j if the following conditions are fulfilled:

i + minJump <= j <= min(i + maxJump, s.length - 1), and
s[j] == '0'.
Return true if you can reach index s.length - 1 in s, or false otherwise. */

//https://leetcode.com/problems/jump-game-vii/
public class JumpGameVII {
    public static void main(String[] args) {
        String s = "0000000000";
        int minJump =2;
        int maxJump = 5;
        System.out.println(canReach(s,minJump,maxJump));
    }
    public static boolean canReach(String s, int minJump, int maxJump) {
        int pre = 0;
        int n = s.length();
        boolean[] dp = new boolean[n];
        dp[0]=true;
        for(int i=1;i<n;i++){
            if(i>=minJump && dp[i-minJump])
                pre++;
            if(i>maxJump && dp[i-maxJump-1])
                pre--;
            dp[i] = pre > 0 && s.charAt(i) == '0';
        }
        return dp[n-1];
    }
}
