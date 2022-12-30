/*
    Given a square matrix mat, return the sum of the matrix diagonals.
    Only include the sum of all the elements on the primary diagonal and
    all the elements on the secondary diagonal that are not part of the primary diagonal.
 */
//https://leetcode.com/problems/matrix-diagonal-sum/
public class MatrixDiagonalSum {
    public static void main(String[] args){
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Matrix Diagonal Sum " + diagonalSum(mat));
    }
    static int diagonalSum(int[][] mat) {
        int sum = 0;
        int start = 0;
        int end = mat[0].length-1;
        
        for(int i=0;i<mat.length;i++){
            if(start<=mat[0].length-1 && end>=0){
                if(start == end){
                    sum +=mat[i][start];
                }
                else{
                    sum +=mat[i][start] + mat[i][end];
                }
                start++;
                end--;
            }
        }
        return sum;
    }
}
