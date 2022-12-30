public class SearchNoInArray {
    public static void main(String[] args){
        int[] arr = {1,13,15,9,20,7};
        boolean result = CheckNumberExists(arr, 14);
        System.out.println(result);
    }
    static boolean CheckNumberExists(int[] arr, int n){
        for(int a : arr){
            if(a == n){
                return true;
            }
        }
        return false;
    }
}
