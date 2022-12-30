/** 
 You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
**/

//https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth {
    public static void main(String[] args){
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println("Richest Customer Wealth : " +maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int maxSum=0;
        for(int[] xx : accounts){
            int sum = 0;
            for(int x : xx){
                sum += x;
            }
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }
    
}
