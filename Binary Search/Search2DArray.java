public class Search2DArray {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println("Element found in given 2D array : "+ Search(matrix,target));
    }
    static boolean Search(int[][] matrix,int target){
        int start = 0, row = matrix.length,col = matrix[0].length,end = row*col-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>matrix[mid/col][mid%col])
                start = mid+1;
            else if(target<matrix[mid/col][mid%col])
                end = mid-1;
            else
                return true;
        }
        return false;
    }
}
