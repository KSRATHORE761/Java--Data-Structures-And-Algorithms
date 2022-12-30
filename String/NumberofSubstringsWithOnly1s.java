public class NumberofSubstringsWithOnly1s {
    public static void main(String[] args) {
        String s = "0110111";
        System.out.println(numSub(s));
    }
    public static int numSub(String s) {
        // int count =0, maxCount=0;
        // for(int i=0;i<s.length();i++){
        //     count = s.charAt(i) == '1' ? count+1 : 0;
        //     maxCount = Math.max(count,maxCount);
        // }
        // return Math.floorDiv((maxCount + 1) * maxCount,2);
        int count=0, res=0, mod = (int)1e9 + 7;
        for(int i=0;i<s.length();i++){
            count = s.charAt(i) == '1' ? count +1 : 0;
            res = (res + count)%mod;
        }
        return res;
    }
}
