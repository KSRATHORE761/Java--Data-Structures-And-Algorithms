
//Write a program to print the sum of digits. If N = 1342 then sum => 1+3+4+2 = 10;
public class SumofDigits {
    public static void main(String[] args){
        int n = 1342;
        System.out.println("Sum of digits: "+findSumOfDigits(n));
    }
    public static int findSumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10 + findSumOfDigits(n/10);
    }
}
