//https://leetcode.com/problems/jump-game/

//You are given an integer array nums. You are initially positioned at the 
//array's first index, and each element in the array represents your maximum 
//jump length at that position.
// Return true if you can reach the last index, or false otherwise.

public class JumpGames {
    public static void main(String[] args){
        int num[] = {2,3,1,1,4};
        System.out.println(CanJump(num));
    }
    static boolean CanJump(int[] nums){
        int  max = 0;
        for(int i=0;i<nums.length;i++){
            if(i>max){
                return false;
            }
            max = Math.max(nums[i]+i,max);
        }
        return true;
    }
}
