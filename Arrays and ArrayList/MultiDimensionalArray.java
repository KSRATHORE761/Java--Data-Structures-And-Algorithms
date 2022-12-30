import java.util.Scanner;
public class MultiDimensionalArray {
    public static void main(String[] args){
        /*
            1 2 3
            4 5 6
            7 8 9
        */
        //2D ARRAY      
        // int[][] num = {{1,2,3},{4,5,6},{7,8,9}};
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        // Taking input from user
        for(int row = 0; row<arr.length;row++){
            for(int col = 0; col < arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }
        }
    }
}
