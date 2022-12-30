
public class FibonacciNo{
    public static void main(String[] args){
        System.out.println(fibo(10));
        System.out.println(fiboFormulla(50));
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    static long fiboFormulla(int n){
        return (long)((Math.pow((1 + Math.sqrt(5))/2,n) - Math.pow((1 - Math.sqrt(5))/2,n))/Math.sqrt(5));
        
    }
}