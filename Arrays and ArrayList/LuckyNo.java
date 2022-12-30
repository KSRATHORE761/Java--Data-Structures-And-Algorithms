import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNo {
    public static void main(String[] args){
        int[][] matrix={{3,7,8},{9,11,13},{15,16,17}};
        System.out.println("Lucky No is "+Arrays.toString(luckyNumbers(matrix).toArray()));
    }    
    static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
         for(int i=0;i<matrix.length;i++){
             int min = Integer.MAX_VALUE;
             int colIndex=0;
             for(int row = 0;row<matrix[0].length;row++){
                 if(min>matrix[i][row]){
                     min = matrix[i][row];
                     colIndex = row;
                 }
             }
             int max = Integer.MIN_VALUE;
             for(int col = 0;col<matrix.length;col++){
                 max = Math.max(max,matrix[col][colIndex]);
             }
             if(min == max){
                 result.add(max);
             }
         }
         return result;
     }
}
