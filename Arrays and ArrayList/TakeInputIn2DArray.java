import java.io.Console;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TakeInputIn2DArray {
    public static void main(String[] args){
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Take Input for 2D Array : ");
        //Taking Input
        for(int row= 0; row<arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }
        }

        //Print Output
         System.out.println("Printing Output of 2D Array : ");
        // for(int row= 0; row<arr.length;row++){
        //     for(int col = 0;col<arr[row].length;col++){
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
