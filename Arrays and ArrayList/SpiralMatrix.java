//https://leetcode.com/problems/spiral-matrix/
//Given an m x n matrix, return all elements of the matrix in spiral order.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(spiralOrder(matrix).toArray()));
    }
    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix==null || matrix.length==0){
            return result;
        }
        int startRow=0, endRow = matrix.length-1,startCol = 0, endCol = matrix[0].length-1;
        int dir = 0;
        while(startRow<=endRow && startCol<=endCol){
            switch(dir) {
                case 0: //RIGHT Move
                    for(int col = startCol;col<=endCol;col++)
                        result.add(matrix[startRow][col]);
                    startRow++;
                    break;
                case 1 : // Down Move
                    for(int row = startRow;row<=endRow;row++)
                        result.add(matrix[row][endCol]);
                    endCol--;
                    break;
                case 2 : // Left Move
                    for(int col = endCol;col>=startCol;col--)
                        result.add(matrix[endRow][col]);
                    endRow--;
                    break;
                case 3 : // Up Move
                    for(int row = endRow;row>=startRow;row--)
                        result.add(matrix[row][startCol]);
                    startCol++;
                    break;
            }
            dir = (dir+1)%4;
        }
        return result;
    }
}
