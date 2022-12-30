public class CountNoOfZeros {
    public static void main(String[] args){
        int n = 12030;
        System.out.println(countingZeros(n, 0));
    }
    public static int countingZeros(int n, int count){
        if(n==0){
            return count;
        }
        int rem = n%10;
        count = rem==0? count+1:count;
        // if(rem==0){
        //     return countingZeros(n/10,count+1);
        // }
        return  countingZeros(n/10,count);
    }
}
