public class Allocateminimumnumberofpages {
    public static void main(String[] args) {
        int[] pages = {3,5,12,16,33,39,65,67,76,90,93};
        int M = 6;
        int N = 11;
        System.out.println("Minimum No Of Pages " + MinimumNoOfPages(pages,N,M));
    }
    static int MinimumNoOfPages(int[] A, int N,int M){
        int low = Integer.MAX_VALUE;
        int high=0, res=-1;
        for(int i=0; i<N; i++){
            high += A[i];
            low = A[i] < low ? A[i] : A[i];
        }
        while(low <= high){
            int mid = (low+high)/2;
            if(allocationPossible(A, mid, M)){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }

    static boolean allocationPossible(int[] arr, int barrier, int M){
        int students=1, pages=0;
        for(int i=0; i<arr.length; i++){
            pages += arr[i];
            if(pages > barrier){
                students++;
                pages = arr[i];
            }
        }
        if(students > M) return false;
        return true;
    }
}
