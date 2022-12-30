//Check No is palindrome or not
public class Palindrome {
    public static void main(String[] args){
        int n = 121;
        System.out.println(isPalindrome(n));
    }
    public static boolean isPalindrome(int n){
        return (n == reverse(n));
    }
    public static int reverse(int n){
        return helper(n, (int)(Math.log10(n))+1);
    }

    public static int helper(int n,int digit){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        n = n/10;
        return rem * (int)(Math.pow(10, digit-1)) + helper(n,digit-1);
    }
}
