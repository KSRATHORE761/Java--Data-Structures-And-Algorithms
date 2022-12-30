import java.util.Arrays;

public class SpecialArrayWithXElementsGreaterThanorEqualX {
    public static void main(String[] args) {
        int[] nums={0,4,3,0,4};
        int x = nums.length;
        int[] counts = new int[x+1];
        for(int elem : nums){
            if(elem >= x){
                counts[x]++;
            }
            else{
                counts[elem]++;
            }
        } 
        System.out.println(Arrays.toString(counts));
        int res = 0;
          for(int i = counts.length-1; i > 0; i--) {
              res += counts[i];
              if(res == i)
                  System.out.println(i);
          }
          
          System.out.println(-1);
      }
    
    public int specialArray(int[] nums) {
        int x = nums.length;
          int[] counts = new int[x+1];
          
          for(int elem : nums)
              if(elem >= x)
                  counts[x]++;
              else
                  counts[elem]++;
          
          int res = 0;
          for(int i = counts.length-1; i > 0; i--) {
              res += counts[i];
              if(res == i)
                  return i;
          }
          
          return -1;
      }
}
