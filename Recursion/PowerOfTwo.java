public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        if(n%2!=0){
            return false;
        }
        return poweroftwo(n,2*1);
    }
    public static boolean poweroftwo(int n,long x){
        if(x>n){
            return false;
        }
        return x == n || poweroftwo(n,(long)(2*x));
    } 
}
