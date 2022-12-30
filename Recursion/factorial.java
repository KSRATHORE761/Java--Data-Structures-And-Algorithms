public class factorial {
    public static void main(String[] args){
        int n = 5;
        System.out.println("Factorial is: "+findFactorial(n));
    }
    public static int findFactorial(int n){
        if(n<=1){
            return 1;
        }
        return n * findFactorial(n-1);
    }
}
