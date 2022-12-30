public class SearchIteminArray{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int result = LinearSearch(arr,4);
        if(result == -1){
            System.out.println("Element is not found in array");
        }
        else{
            System.out.println("Element is found at "+ result+ " index");
        }
    }
    static int LinearSearch(int[] arr, int n){
        if(arr.length==0){
            return -1;
        }
        for(int index =0;index<arr.length;index++){
            if(arr[index]== n){
                return index;
            }
        }
        return -1;
    }
}