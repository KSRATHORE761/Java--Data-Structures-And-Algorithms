import java.util.Arrays;

public class SearchInMatrixColRowWise {
    public static void main(String[] args) {
        int target = 37;
        int[][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        System.out.println(Arrays.toString(SearchIn2dArray(arr,target)));
    }
    static int[] SearchIn2dArray(int[][] arr,int target){
        int r = 0, c =arr.length-1;
        while(r<arr.length && c>0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            else if(arr[r][c]>target){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
