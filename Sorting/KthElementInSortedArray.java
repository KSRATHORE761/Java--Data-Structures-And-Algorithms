import java.util.Arrays;

public class KthElementInSortedArray {
    public static void main(String[] args) {
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        int k =8;
        System.out.println(findKthElementInSortedArrayUsingBinarySearch(matrix,k));
    }
    public static int findKthElementInSortedArray(int[][] matrix,int k){
        int n = matrix.length;
        int[] res = new int[n*n];
        int index=0;
        for(int i =0;i<n;i++){
             for(int j =0;j<n;j++){
                res[index] = matrix[i][j];
                index++;
            }
        }
        System.out.println(Arrays.toString(res));
        Arrays.sort(res);
        System.out.println(Arrays.toString(res));
        return res[k-1];
    }
    public static int findKthElementInSortedArrayUsingBinarySearch(int[][] matrix,int k){
        int low=matrix[0][0];
        int high = matrix[matrix.length-1][matrix[0].length-1];
        while(low<=high){
            int mid = low +(high-low)/2;
            int count = countLessorEqual(matrix,mid);
            if(count<k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }
    public static int countLessorEqual(int[][] matrix,int mid){
        int count = 0;
        int col = matrix[0].length-1;
        int row=0;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]>mid){
                col--;
            }
            else{
                count += col+1;
                row++;
            }
        }
        return count;
    }
}
