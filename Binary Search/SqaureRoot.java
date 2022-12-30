//https://leetcode.com/problems/sqrtx/
// Given a non-negative integer x, compute and return the square root of x.

// Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

// Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
public class SqaureRoot {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(mySqrt(num));
    }
    static int mySqrt(int x) {
        int left = 1, right = Integer.MAX_VALUE;
        while(left<=right){
            int mid = left +(right-left)/2;
            if(mid==x/mid){
                return mid;
            }
            else if(mid<x/mid){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return right;
    }
}
