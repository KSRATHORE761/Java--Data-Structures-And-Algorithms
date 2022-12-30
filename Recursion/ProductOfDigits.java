public class ProductOfDigits {
    public static void main(String[] args) {
        int number = 1340;
        System.out.println("product of digits: "+getProductOfDigits(number));
    }
    public static int getProductOfDigits(int n){
        if(n==0){
            return 1;
        }
        return (n%10) * getProductOfDigits(n/10);
    }
}
