public class MaximumProductofThreeNumbers {
    public static void main(String[] args) {
        int[] nums = {-3,-4,1,2,3,4};
        System.out.println("Maximum Product of 3 No's : "+findMaximumProduct(nums));
    }
    public static int findMaximumProduct(int[] nums){
        int max1 = Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for(int n : nums){
            //Updating Max values;
            if(n>max1){
                max3=max2;
                max2= max1;
                max1=n;
            }
            else if(n>max2){
                max3=max2;
                max2=n;
            }
            else if(n>max3){
                max3=n;
            }
            //Updating MIn values;
            if(n<min1){
                min2=min1;
                min1=n;
            }
            else if(n<min2){
                min2=n;
            }
        }
        return Math.max(max1*max2*max3,min1*min2*max1);
    }
}
