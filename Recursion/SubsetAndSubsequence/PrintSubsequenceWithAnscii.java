import java.util.ArrayList;
import java.util.Arrays;

public class PrintSubsequenceWithAnscii {
    public static void main(String[] args){
        System.out.println(subseqeunceWithAnscII("", "abc"));
    }
    public static ArrayList<String> subseqeunceWithAnscII(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> lst = new ArrayList<>();
            lst.add(p);
            return lst;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqeunceWithAnscII(p+ch,up.substring(1));
        ArrayList<String> second = subseqeunceWithAnscII(p,up.substring(1));
        ArrayList<String> third = subseqeunceWithAnscII(p+(ch+0),up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }

}
