// You are standing at position 0 on an infinite number line.
// There is a destination at position target.
// You can make some number of moves numMoves so that:
// On each move, you can either go left or right.
// During the ith move (starting from i == 1 to i == numMoves), you take i steps in 
// the chosen direction.Given the integer target, return the minimum number of 
// moves required (i.e., the minimum numMoves) to reach the destination.

//https://leetcode.com/problems/reach-a-number/
public class ReachANumber {
    public static void main(String[] args) {
        int target = 2;
        System.out.println(ReachNo(target)); 
    }
    static int ReachNo(int target){
        int step=0,sum=0;
        target = Math.abs(target);
        while(sum<target){
            step++;
            sum +=step;
        }
        while((sum-target)%2!=0){
            step++;
            sum +=step;
        }
        return step;
    }
}
