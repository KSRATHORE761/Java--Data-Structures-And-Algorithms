// A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

// You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

// Return the number of indices where heights[i] != expected[i].

//https://leetcode.com/problems/height-checker/
import java.util.Arrays;
public class HeightChecker {
    public static void main(String[] args) {
        int[] height = {1,2,3,4,5};
        System.out.println(heightChecker(height));
    }
    public static int heightChecker(int[] height){
        int mismatchHeightCount = 0;
        int[] bucket = new int[101];

        for(int h :height){
            ++bucket[h];
        }
        System.out.println(Arrays.toString(bucket));

        for(int i=0,b=0;i<height.length;){
            if(bucket[b]==0){
                b++;
                continue;
            }
            if(b != height[i]){
                mismatchHeightCount++;
            }
            bucket[b]  =bucket[b]-1;
            i++;
        }

        return mismatchHeightCount;
    }
}
