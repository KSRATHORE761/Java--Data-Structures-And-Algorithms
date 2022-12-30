//https://leetcode.com/problems/house-robber/
public class HouseRob {
    public static void main(String[] args){
        int[] nums={1,2,3,1};
        System.out.println(Rob(nums));
    }
    static int Rob(int[] nums){
        int PreviousHouseRobYes = 0;
        int PreviousHouseRobNo = 0;
        for(int i =0;i<nums.length;i++){
            int currentHouseRobYes = PreviousHouseRobNo + nums[i];
            int currentHouseRobNo = Math.max(PreviousHouseRobYes,PreviousHouseRobNo);
            //Update values for next round :
            PreviousHouseRobYes = currentHouseRobYes;
            PreviousHouseRobNo = currentHouseRobNo;
        }
        return Math.max(PreviousHouseRobYes,PreviousHouseRobNo);
    }
}
