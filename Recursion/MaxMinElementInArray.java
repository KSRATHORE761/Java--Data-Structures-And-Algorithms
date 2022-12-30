public class MaxMinElementInArray {
    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, -50, 10, 2};
        System.out.println("Maximum Element: "+getMaximumElement(arr, 0));
        System.out.println("Minimum Element: "+getMinimumElement(arr, 0));
    }
    public static int getMaximumElement(int[] arr,int i){
        if(i==arr.length-1){
            return arr[i];
        }
        return Math.max(arr[i],getMaximumElement(arr, i+1));

    }
    public static int getMinimumElement(int[] arr,int i){
        if(i==arr.length-1){
            return arr[i];
        }
        return Math.min(arr[i],getMinimumElement(arr, i+1));

    }
}
