//https://leetcode.com/problems/set-matrix-zeroes/
//Given an m x n integer matrix matrix, if an element is 0, 
//set its entire row and column to 0's.
import java.util.Arrays;

public class SetZeroMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        ZeroMatrix(matrix);
    }   
    static void ZeroMatrix(int[][] matrix){
        int col1=1, row = matrix.length,col = matrix[0].length;
        for(int i = 0;i<row;i++){
            if(matrix[i][0]==0){
                col1 = 0;
            }
            for(int j = 1;j<col;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=matrix[0][j]=0;
                }
            }
        }
        for(int i = row-1;i>=0;i--){
            for(int j = col-1;j>=1;j--){
                if(matrix[i][0]==0 || matrix[j][0]==0){
                    matrix[i][j]=0;
                }
            }
            if(col1==0){
                matrix[i][0]=0;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
