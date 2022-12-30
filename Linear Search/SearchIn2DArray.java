public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12,13,14,15}};
        int target = 14;
        SearchElementIn2DArray(arr,target);
    }
    static void SearchElementIn2DArray(int[][] arr, int target){
        if(arr.length==0){
            System.out.println("Array is empty");
        }
        for(int[] num : arr){
            for(int a : num){
                if(a == target){
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
        return ;
    }
}
