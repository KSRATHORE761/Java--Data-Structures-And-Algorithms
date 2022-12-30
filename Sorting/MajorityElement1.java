public class MajorityElement1 {
    public static void main(String[] args) {
        int[] nums = {8,8,7,7,7};
        System.out.println("Majority Element that appears N/2 times is: "+ findMajorityElement(nums));
    }
    public static int findMajorityElement(int[] arr){
        int candidate = arr[0];
        int count=1;
        for(int i =1;i<arr.length;i++){
            if(count == 0){
                candidate = arr[i];
            }
            if(candidate==arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}
