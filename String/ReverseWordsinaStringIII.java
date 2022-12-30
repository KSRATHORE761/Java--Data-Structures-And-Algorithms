public class ReverseWordsinaStringIII {
    public static void main(String[] args){
        String s = "Let's take LeetCode contest";
        System.out.println(ReverseWord(s));
    }
    public static String ReverseWord(String s){
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String w : words){
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            res.append(sb.toString());
            res.append(" ");
        }
        return res.toString().trim();
    }
}
