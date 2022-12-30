public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println("Shuffled String: "+shuffletheString(s,indices));
    }
    public static String shuffletheString(String s ,int[] indices){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            int index=0;
            while(i!=indices[index]){
                index++;
            }
            sb.append(s.charAt(index));
        }
        return sb.toString();
    }
}
