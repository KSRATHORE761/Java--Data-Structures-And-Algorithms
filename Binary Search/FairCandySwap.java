import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class FairCandySwap {
    public static void main(String[] args) {
        int[] aliceSizes={1,2};
        int[] bobSizes={2,2};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes,bobSizes)));
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Set<Integer> set = new HashSet<>();
        int diff = (IntStream.of(aliceSizes).sum() - IntStream.of(bobSizes).sum()) / 2;
        for(int a : aliceSizes)
            set.add(a);
        for(int b : bobSizes){
            if(set.contains(b+diff))
                return new int[]{b+diff,b};
        }
        return new int[0];
    }
}
