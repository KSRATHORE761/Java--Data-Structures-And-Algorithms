/*
 * Given an n x n binary matrix image, 
 * flip the image horizontally, then invert it, and return the resulting image.
 */
//https://leetcode.com/problems/flipping-an-image/
import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args){
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }
    static int[][] flipAndInvertImage(int[][] image) {
        //Flip the image
//         for(int i =0;i<image.length;i++){
//             int start = 0;
//             int end = image[i].length-1;
//             while(start<end){
//                 swap(image[i],start,end);
//                 start++;
//                 end--;
//             }
//         }
        
//         // Invert the Array/Image
        
//         for(int i =0;i<image.length;i++){
//             for(int j = 0; j<image[i].length;j++){
//                 if(image[i][j]==0){
//                     image[i][j] =1;
//                 }
//                 else if(image[i][j] ==1){
//                     image[i][j] =0;
//                 }
//             }
//         }
            for(int i =0;i<image.length;i++){
            int start = 0;
            int end = image[i].length-1;
            while(start<=end){
                if(image[i][start] == image[i][end])
                {
                    image[i][start] = 1-image[i][start];
                    image[i][end] = image[i][start];
                }
                start++;
                end--;
            }
        }
        return image;
    }
    // public void swap(int[] arr,int start,int end){
    //     int temp = arr[start];
    //     arr[start] = arr[end];
    //     arr[end] = temp;
    // }
}
