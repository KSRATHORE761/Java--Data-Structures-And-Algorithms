public class ShiftingLetters {
    public static void main(String[] args) {
        String s="abc";
        int[] shifts ={3,5,9}; 
        System.out.println(shiftingLetters(s, shifts));
        
    }
    public static String shiftingLetters(String s, int[] shifts) {
        StringBuilder sb = new StringBuilder(s);
        long shift =0;
        for(int i=s.length()-1;i>-1;i--){
            sb.setCharAt(i,(char)(((s.charAt(i) - 'a') + (shift + shifts[i])%26)%26 +'a'));
            shift +=shifts[i];
        }
        return sb.toString();
    }
}
