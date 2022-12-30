public class ReverseGivenNumber {
    static int reverse = 0;
    public static void main(String[] args){
        int n = 12345;
        //Reverse(n);
        System.out.println(Reverse2(n));
    }
    public static void Reverse(int n){
        if(n==0){
            return;
        }
        int remainder = n%10;
        reverse = reverse * 10 + remainder;
        Reverse(n/10);
    }

    public static int Reverse2(int n){
        int digit = (int)(Math.log10(n))+1;
        return helper(n,digit);
    }
    public static int helper(int n, int digit){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10,digit-1)) + helper(n/10,digit-1);
        }
}
