public class MinimumLenAfterDeletingSimilarEnds {
    public static void main(String[] args) {
        String s ="cabaabac";
        System.out.println("minimum Length: "+minimumLength(s));
    }
    public static int minimumLength(String s) {
        int left =0, right = s.length()-1;
        while(left<right && s.charAt(left)==s.charAt(right)){
            char character = s.charAt(right);
            while(left <= right && character ==s.charAt(left)){
                left++;
            }
            while(left<=right && character== s.charAt(right)){
                right--;
            }
        }
        return right-left+1;
    }
}
