//https://leetcode.com/problems/transpose-matrix/
import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args){
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(transpose(matrix)));

    }
    static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        if(m == n) {
            return transpose_(matrix);
        }
        int[][] dummy = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                dummy[i][j] = matrix[j][i];
            }
        }
        return dummy;
    }
    
    static int[][] transpose_(int[][] matrix) {
        for(int i = 0; i < matrix.length; i += 1) {
            for(int j = i + 1; j < matrix[0].length; j += 1) {
                swap(matrix, i, j);
            }
        }
        return matrix;
    }
    static void swap(int[][] A, int i, int j) {
        A[i][j] = A[i][j] ^ A[j][i];
        A[j][i] = A[i][j] ^ A[j][i];
        A[i][j] = A[i][j] ^ A[j][i];
    }
}
