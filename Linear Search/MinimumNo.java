public class MinimumNo {
    public static void main(String[] args) {
        int[] arr = {123,-5,0,67744,32434,1232346,632};
        System.out.println("Minimum no is " + MinimumNumber(arr));
    }
    static int MinimumNumber(int[] A){
        int minVal = Integer.MAX_VALUE;
        for(int a : A){
            if(a<minVal){
                minVal = a ; 
            }
        }
        return minVal;
    }
}
