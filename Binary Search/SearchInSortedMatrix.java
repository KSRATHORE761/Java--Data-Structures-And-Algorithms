import java.util.Arrays;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
            int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
            };
            int target = 18;
            System.out.println(Arrays.toString(searchMatrix(arr,target)));
    }
    static int[] searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return new int[]{-1,-1};
        }
        int start = 0, rows = matrix.length, cols = matrix[0].length;
        int end = rows * cols - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (matrix[mid / cols][mid % cols] == target) {
                return new int[]{mid / cols,mid % cols};
            } 
            if (matrix[mid / cols][mid % cols] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
}
