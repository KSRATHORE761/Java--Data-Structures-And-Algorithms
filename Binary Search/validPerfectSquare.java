//https://leetcode.com/problems/valid-perfect-square/
// Given a positive integer num, write a function which returns 
// True if num is a perfect square else False.
// Follow up: Do not use any built-in library function such as sqrt.
public class validPerfectSquare {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));

    }
    static boolean isPerfectSquare(int num) {
        long left = 0;
        long right = num;
        while(left<=right){
            long mid = left + (right-left)/2;
            if(mid * mid == num){
                return true;
            }
            else if(mid * mid < num){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return false;
    }
}
