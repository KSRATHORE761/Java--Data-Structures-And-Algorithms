public class CheckPrime {
    public static void main(String[] args) {
        int n =10;
        int i=2;
        System.out.println(isCheck(n,i));
    }
    public static boolean isCheck(int n, int i){
        if(n<=2){
            return n==2 ? true : false;
        }
        if(n%i==0){
            return false;
        }
        if(i*i>n){
            return true;
        }
        return isCheck(n, i+1);
    }
}
