import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
public class SortArraybyIncreasingFrequency {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3};
        System.out.println(Arrays.toString(frequencySort(arr)));
    }
    public static int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        List<Map.Entry<Integer,Integer>> lst = new ArrayList<>(map.entrySet());
        Collections.sort(lst, new Comp());

        int[] res= new int[nums.length];
        int index =0;
        for(Map.Entry<Integer,Integer> entry : lst){
            int val = entry.getValue();
            while(val>0){
                res[index++] = entry.getKey();
                val--;
            }
        }
        return res;
    }
     //Compare as per Frequency and Key.
     private static class Comp implements Comparator<Map.Entry<Integer,Integer>>{
        
        @Override
        public int compare(Map.Entry<Integer,Integer> m1, Map.Entry<Integer,Integer> m2){
            if(m1.getValue() == m2.getValue()){
                return -m1.getKey() + m2.getKey();
            }
            return m1.getValue() - m2.getValue();
        }
    }
}

